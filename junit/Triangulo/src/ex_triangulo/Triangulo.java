/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_triangulo;

public class Triangulo {

    public static boolean ehTriangulo(int a, int b, int c) {
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            return true;
        } else {
            return false;
        }
    }

    public static String obterTipo(int a, int b, int c) {
        String tipo;

        if (!ehTriangulo(a, b, c)) {
            tipo = "nao eh um triangulo";
        } else if (a == b && b == c) {
            tipo = "EQUILATERO";
        } else if (a != b && a != c && b != c) {
            tipo = "ESCALENO";
        } else {
            tipo = "ISOSCELES";
        }

        return tipo;
    }

}
