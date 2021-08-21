public class Lista {

    private int counter = 0;


    private double[] list;
    private double[] listBackup;



    public Lista(int lenght){
        this.list = new double[lenght];
        this.listBackup = new double[lenght];
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
        list = listBackup;

        counter = 0;
    }

}
