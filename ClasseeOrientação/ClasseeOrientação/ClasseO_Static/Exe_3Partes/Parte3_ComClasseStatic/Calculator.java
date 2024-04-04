package ClasseO_Static.Exe_3Partes.Parte3_ComClasseStatic;

public class Calculator {

        public static double r;
        public static final double pi = 3.14;
    
        public static double circumference(){
            return 2*(pi*r);
        }
    
        public static double volume(){
            return 4*pi*Math.pow(r, 3)/3;
        }
    
    }

