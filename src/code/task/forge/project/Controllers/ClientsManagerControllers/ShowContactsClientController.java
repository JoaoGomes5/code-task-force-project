package code.task.forge.project.Controllers.ClientsManagerControllers;

import code.task.forge.project.DAO.AddressDAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;



    import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

public class ShowContactsClientController {

        @FXML
        private TableView<Contact> tbContacts;

        @FXML
        private TableColumn<Contact, String> clContact;

        @FXML
        private TableColumn<Contact, String> clContactType;

        @FXML
        private TableColumn<Contact, String> clContactNotes;

        @FXML
        private TableColumn<Contact, String> clContactImportance;

        private String nif = "";
        private AddressDAO addressDAO = new AddressDAO();
        private ObservableList<Contact> contactsObservableListList = FXCollections.observableArrayList();

    public void initData(List<Contact> contacts) throws SQLException {

        if(contacts != null){
            if(!contactsObservableListList.isEmpty()){
                contactsObservableListList.clear();
                System.out.println("Cleaned");
            }



            for(Contact contact: contacts) {
                Contact conts = new Contact(
                        contact.getContact(),
                        contact.getContactType(),
                        contact.getObservation(),
                        contact.getImportanceType()

                );
                System.out.println(conts.getContact());


                contactsObservableListList.add(conts);
            }


            clContact.setCellValueFactory(new PropertyValueFactory<Contact, String>("contact"));
            clContactType.setCellValueFactory(new PropertyValueFactory<Contact, String>("contactType"));
            clContactNotes.setCellValueFactory(new PropertyValueFactory<Contact, String>("observation"));
            clContactImportance.setCellValueFactory(new PropertyValueFactory<Contact, String>("importanceType"));


            tbContacts.setItems(contactsObservableListList);
        }


    }

    }


