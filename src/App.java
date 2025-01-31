public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        for(int x = 1; x<=8; x++){
            System.err.println(x + " hola mundo");
        }
        suma(4,5);
        App resta = new App();
        resta.restar(10, 1);
        saludo msj = new saludo();
        msj.saludar();   
        Jugar isaac = new Jugar();
        isaac.Jugando();

    }
    public static void suma(int x, int y){
        int result = 0;
        result = x + y;
        System.out.println("El resultado de " + x + " + " + y + " = " + result);
    }
    public int restar(int x, int y){
        int result = 0;
        result = x - y;
        System.out.println(result);
        return result;
    }
}

