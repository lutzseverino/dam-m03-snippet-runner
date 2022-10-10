package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;
import com.lutzseverino.question.Question;

@Name("percentage") @Name("class")
public class MaleFemalePercentage implements Snippet {

    /*
        START
            SHOW ("¿Cuántos hombres hay?")
            READ (males)

            SHOW ("¿Cuántas mujeres hay?")
            READ (females)

            total <- males + females

            malePercentage <- males / total * 100
            femalePercentage <- females / total * 100

            SHOW ("El " + femalePercentage + "% de la clase son hombres.")
            SHOW ("El " + malePercentage + "% de la clase son mujeres.")
        END
     */
    @Override public void run() {
        Question question = new Question();

        int males = question.askInt("¿Cuántos hombres hay?: ");
        int females = question.askInt("¿Cuántas mujeres hay?: ");
        int total = males + females;

        double malePercentage = (double) males / total * 100;
        double femalePercentage = (double) females / total * 100;

        System.out.println("\nEl " + malePercentage + "% de la clase son hombres.");
        System.out.println("El " + femalePercentage + "% de la clase son mujeres.");
    }

}
