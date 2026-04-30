 *
 * @author MAHASISWA
 */
public class PB {

    /**
     * @param args the command line arguments
     */

            public static void main(String[] args){
            int i, j;
    
            int[][] nil_akhir = {
//baris ke samping
                {150,159,230,300},
                {100,125,150,342}, 
                {210,125,156,324},//kolom ke bawah
                {564,345,564,764},
                {756,867,654,354}
            };

           

            
            
            System.out.println("Data Yang Diinput ke Elemen Array \n");
            //menampilkan data dari elemen array
            for(i=0; i<5; i++){
            for(j=0; j<4; j++){
            System.out.print("Nilai Akhir Index ["+i+"]["+j+"] = ");
            System.out.println(" = " + nil_akhir[i][j]);
            }
            }
            
            
            
         
            }
           
           
           
         
}
