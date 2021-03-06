package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Для выполнения запроса PreparedStatement имеет три метода:
 * 1. boolean execute(): выполняет любую SQL-команду
 * 2. ResultSet executeQuery(): выполняет команду SELECT,
 *    которая возвращает данные в виде ResultSet
 * 3. int executeUpdate(): выполняет такие SQL-команды,
 *    как INSERT, UPDATE, DELETE, CREATE и возвращает количество измененных строк
 */

public class SqlTracker implements Store {

    private final Connection connection;

    public SqlTracker(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void init() {
         try {
             DatabaseMetaData metaData = connection.getMetaData();
             System.out.println(metaData.getUserName());
             System.out.println(metaData.getURL());
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }

    @Override
    public Item add(Item item) {
        String sqlAdd = "insert into tracker.public.items (name) values (?)";
        try (PreparedStatement ps = connection.prepareStatement(sqlAdd, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, item.getName());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            item.setId(rs.getString("id"));
            item.setName(rs.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    private int indexOf(int id) {
        int result = -1;
        String sqlFindId = "select * from tracker.public.items where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlFindId)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean replace(String id, Item item) {
        int rows = 0;
        int idToReplace = indexOf(Integer.valueOf(id));
        String sqlEdit = "update tracker.public.items set name = ? where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlEdit)) {
            ps.setString(1, item.getName());
            ps.setInt(2, idToReplace);
            rows = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows != 0;
    }

    @Override
    public boolean delete(String id) {
        int rows = 0;
        int idToDelete = indexOf(Integer.parseInt(id));
        String sqlDelete = "delete from tracker.public.items where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlDelete)) {
            ps.setInt(1, idToDelete);
            rows = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows != 0;
    }

    @Override
    public List<Item> findAll() {
        List<Item> result = new ArrayList<>();
        String sqlFindAll = "select * from tracker.public.items";
        try (PreparedStatement ps = connection.prepareStatement(sqlFindAll)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setId(String.valueOf(rs.getInt("id")));
                item.setName(rs.getString("name"));
                result.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        String sqlFindByName = "select * from tracker.public.items where name = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlFindByName)) {
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setId(String.valueOf(rs.getInt("id")));
                item.setName(rs.getString("name"));
                result.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Item findById(String id) {
        Item itemToFind = null;
        int idToFind = indexOf(Integer.parseInt(id));
            String sqlEdit = "select * from tracker.public.items where id = ?";
            try (PreparedStatement ps = connection.prepareStatement(sqlEdit)) {
                ps.setInt(1, idToFind);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    itemToFind = new Item();
                    itemToFind.setId(String.valueOf(rs.getInt("id")));
                    itemToFind.setName(rs.getString("name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return itemToFind;
    }

    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
}
