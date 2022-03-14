package Soal3;
import java.util.ArrayList;
import java.util.List;

public class Mobil {
    static float kapasitasMax;
    public static float sum=0;
    static List<String> muatan=new ArrayList<>();
    static List<Float> berat=new ArrayList<>();
    public static void tambahMuatan(Hewan apapun)
    {
        for(float i : berat) {
            sum = sum + i;
        }
        if(sum<=kapasitasMax)
        {
            sum=sum+apapun.getBerat();
            berat.add(apapun.getBerat());
            muatan.add(apapun.getNamaHewan());
        }
    }

    public static void daftarMuatan() 
    {
        System.out.println(muatan);
    }
}
