public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "R";
        switch( sigla ) {

            case"P":{
                System.out.println("PEQUENO");
                break;
            }
            case"M":{
                System.err.println("MEDIO");
                break;
            }
            case"G":{
                System.err.println("GRANDE");
                break;
            }
            default:
                System.err.println("INDEFINIDO");
        }
    }
}
