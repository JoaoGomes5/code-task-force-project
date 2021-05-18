/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project;

import java.io.IOException;
import java.sql.SQLException;

import code.task.forge.project.Models.Menu;

import java.io.IOException;

/**
 *
 * @author Code Task Force Team
 */
public class CodeTaskForgeProject {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws SQLException, IOException {

        code.task.forge.project.database.SQLConnection.all2you();
        Menu Menu = new Menu();
        Menu.Menu();
    }
}
