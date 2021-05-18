package code.task.forge.project.handlers;

import code.task.forge.project.classes.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * Clase ComponentHandler.
 * @author Ricardo Santos
 */
public class ComponentHandler {

    public static ArrayList<Component> components = new ArrayList<Component>();
/**
 * Criação do componente.
 * @return Retorna o objeto componente.
 * @throws IOException 
 */
    public static Component createComponent () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduza a Referência do Componente");
        String reference = reader.readLine();
        System.out.println("Introduza a Designação Comercial");
        String commercialDesignation = reader.readLine();
        System.out.println("Introduza a Versão");
        String version = reader.readLine();
        System.out.println("Introduza a Quantidade em Stock");
        float stockQuantity = Float.parseFloat(reader.readLine());
        System.out.println("Introduza a Unidade de Medida");
        String measureUnit = reader.readLine();
        System.out.println("Introduza um Componente Alternativo em caso de rutura de Stock");
        String alternative = reader.readLine();

        Component component = new Component(reference, commercialDesignation, version, stockQuantity, measureUnit, alternative);

        components.add(component);

        return component;
    }

}