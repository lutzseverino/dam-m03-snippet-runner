package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;
import com.lutzseverino.question.Question;

@Name("pass")
public class PassOrNoPass implements Snippet {

    /*
        START
            SHOW ("¿Cuántos alumnos hay?")
            READ (students)

            FOR (i <- 0 TO students) DO
                SHOW ("Para el alumno nº" + i)

                SHOW ("Introduce la nota de los ejercicios entregables: ")
                READ (exercises)
                SHOW ("Introduce la nota de los POUS evaluables: ")
                READ (pous)
                SHOW ("Introduce la nota del examen final: ")
                READ (finalExam)
                SHOW ("Introduce la nota de la práctica final: ")
                READ (finalEssay)

                average <- (exercises * 0.10) + (pous * 0.20) + (finalExam * 0.40) + (finalEssay * 0.30)

                IF (average >= 5) THEN
                    SHOW ("Aprobado")
                ELSE THEN
                    SHOW ("Suspenso")
                END IF
            END FOR
        END
     */
    @Override public void run() {
        Question question = new Question();

        System.out.println();
        int students = question.askInt("¿Cuántos alumnos hay?: ");

        for (int i = 0; i < students; i++) {
            System.out.println("Para el alumno nº" + (i + 1));

            double exercises = question.askDouble("Introduce la nota de los ejercicios entregables: ");
            double pous = question.askDouble("Introduce la nota de los POUS evaluables: ");
            double finalExam = question.askDouble("Introduce la nota del examen final: ");
            double finalEssay = question.askDouble("Introduce la nota de la práctica final: ");
            double average = (exercises * 0.10) + (pous * 0.20) + (finalExam * 0.40) + (finalEssay * 0.30);

            System.out.print("\n");
            System.out.println(average >= 5 ? "Aprobado" : "Suspenso");
        }

    }
}
