public class Pajaro extends Animal implements Volador {

    private String nombre;

    public Pajaro(String nombre) {
        this.nombre = nombre;



    }
    public String canta(String pajaro){
        System.out.println ("el pajaro canta");
return "el pajaro canta" + pajaro;
    }

    @Override
    public void volar() {

    }
}