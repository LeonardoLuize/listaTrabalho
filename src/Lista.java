public class Lista {

    private int counter = 0;


    private double[] list;

    public Lista(int lenght){
        this.list = new double[lenght];
    }

    public void add(double value){
        list[counter] = value;
        counter++;
    }

    public int lenght(){
        return counter;
    }

    public double getListItem(int index){
        if(index < counter){
            return list[index];
        }else{
            System.out.println("Indice inválido");
        }

        return 404;
    }

    public void setListItem(int index, double value){
        list[index] = value;
    }

    public void cleanList(){
        counter = 0;
    }

}
