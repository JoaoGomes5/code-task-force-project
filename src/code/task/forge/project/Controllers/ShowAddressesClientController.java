package code.task.forge.project.Controllers;

import code.task.forge.project.DAO.AddressDAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ShowAddressesClientController implements Initializable {
    @FXML
    private TableView<Address> tbAddresses;

    @FXML
    private TableColumn<Address, String> clClientAddress;

    @FXML
    private TableColumn<Address, String> clClientPostalCode;

    @FXML
    private TableColumn<Address, String> clClientLocality;

    @FXML
    private TableColumn<Address, String> clClientCountry;

    @FXML
    private TableColumn<Address, String> clClientAddressImportance;

    private String nif = "";
    private AddressDAO addressDAO = new AddressDAO();
    private List<Address> addresses =  addressDAO.read(nif);
    private ObservableList<Address> addressesObservableListList = FXCollections.observableArrayList();


    public ShowAddressesClientController() throws SQLException {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {

            updateTable();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public void updateTable() throws SQLException {

    }

    public void initData(List<Address> addresses) throws SQLException {

        if(addresses != null){
            if(!addressesObservableListList.isEmpty()){
                addressesObservableListList.clear();
                System.out.println("Cleaned");
            }



            for(Address address: addresses) {
                System.out.println(address.getAddress());
                Address adr = new Address(
                        address.getAddress(),
                        address.getPostalCode(),
                        address.getLocality(),
                        address.getCountry(),
                        address.getImportanceType()
                );


                addressesObservableListList.add(adr);
            }


            clClientAddress.setCellValueFactory(new PropertyValueFactory<Address, String>("address"));
            clClientPostalCode.setCellValueFactory(new PropertyValueFactory<Address, String>("postalCode"));
            clClientLocality.setCellValueFactory(new PropertyValueFactory<Address, String>("locality"));
            clClientCountry.setCellValueFactory(new PropertyValueFactory<Address, String>("country"));
            clClientAddressImportance.setCellValueFactory(new PropertyValueFactory<Address, String>("importanceType"));

            tbAddresses.setItems(addressesObservableListList);
        }


    }
}
