/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.handlers;

import code.task.forge.project.classes.Line;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ricardo Santos
 */
public class LineHandler {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/**
 * Criação de linha.
 * @return retorna o objeto linha.
 * @throws IOException 
 */
    public static Line createLine() throws IOException {
        System.out.println("Introduza a referência!");
        String lineReference = reader.readLine();
        System.out.println("Introduza a descrição!");
        String lineDescription = reader.readLine();
        System.out.println("Introduza a versão!");
        String lineVersion = reader.readLine();
        System.out.println("Introduza a quantidade!");
        int lineQuantity = reader.read();
        System.out.println("Introduza a unidade!");
        String lineUnit = reader.readLine();
        System.out.println("Introduza o preço unitário!");
        String lineUnitPrice = reader.readLine();
        System.out.println("Introduza o valor total!");
        String lineValorTotal = reader.readLine();
        

        Line line = new Line(lineReference,lineDescription,lineVersion,lineQuantity,lineUnit,lineUnitPrice,lineValorTotal);
        return line;
    }
}
