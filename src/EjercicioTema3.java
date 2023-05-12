public class EjercicioTema3 {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Erika", "José", "Pedro"};
        String todo="";
        for(String nomb: nombres){
            todo= todo.concat(nomb);
            todo=todo.concat(" ");
        }
        System.out.println(todo);
    }
}
