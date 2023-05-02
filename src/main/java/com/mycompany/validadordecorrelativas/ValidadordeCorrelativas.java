/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validadordecorrelativas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import jdk.jshell.Snippet;
/**
 *
 * @author leand
 */
public class ValidadordeCorrelativas 
{

     private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private static Conexion conexion = new Conexion();
    
  
    
    
    
    public static void main(String[] args) throws SQLException
     
         
            
            
    {
        
       try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. agregar estudiante");
                System.out.println("2. agregar materia");
                System.out.println("3. verificar inscripcion");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        agregarEstudiante(scanner);
                        break;
                    case 2:
                        agregarMateria(scanner);
                        break;
                    case 3:
                        verificarInscripcion(scanner);
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
         private static void agregarEstudiante(Scanner scanner) throws SQLException {
        System.out.print("ingrese legajo (5 digitos como minimo): ");
        String legajo = scanner.nextLine();

        if (!legajo.matches("\\d{5}")) {
            System.out.println("legajo invalido.");
            return;
        }

        System.out.print("ingrese nombre: ");
        String nombre = scanner.nextLine();

       

        conexion.estableceConexion();
        Statement stmt = conexion.conectar.createStatement();
        stmt.executeUpdate("INSERT INTO alumno VALUES(\"" + nombre + "\",'" + legajo + "');");
        conexion.cerrarConnection();
        
        } 
           private static void agregarMateria(Scanner scanner) throws SQLException {
        System.out.print("Enter nombre: ");
        String nombre = scanner.nextLine();

         conexion.estableceConexion();
        Statement stmt = conexion.conectar.createStatement();
        stmt.executeUpdate("INSERT INTO materia VALUES(\"" + nombre + "\",'" );
        conexion.cerrarConnection();
        
    }
            private static void verificarInscripcion(Scanner scanner) throws SQLException {
        System.out.print("ingrese numero de legajo del estudiante: ");
        String legajo = scanner.nextLine();

        System.out.print("ingrese nombre de materia: ");
        String materia = scanner.nextLine();

        conexion.estableceConexion();
        Statement stmt = conexion.conectar.createStatement();
        stmt.executeUpdate("INSERT INTO correlativa VALUES(\"" + legajo + "\",'" + materia + "');");
        conexion.cerrarConnection();
        
    }

   
    }
        
   

        