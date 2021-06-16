package code.task.forge.project.DAO;

import code.task.forge.project.Models.Address;

public class AddressDAO {

    public static void insert() {

        DAO dao = new DAO();

        String query = "INSERT INTO Address VALUES ( ?, ?, ?, ?, ?, ? )";

        dao.executeQuery(query, 1);
        dao.executeQuery(query, "bla bla bla");
        dao.executeQuery(query, (String)"4500-121");
        dao.executeQuery(query, (String) "Cesque");
        dao.executeQuery(query, (String) "Teste");
        dao.executeQuery(query, (String) "Teste");


        dao.closeConnection();
    }


    public static void read(Address address) {

    }


    public static void update(Address address) {

    }



    public static void delete(Address address) {

    }
}
