import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ChangeUnit {

    public ChangeUnit(){}
    private int id;
    private double data;
    private double converterData;
    private boolean check = true;
    public void start() throws InterruptedException {
        while(check)
        {
            downloadData();
            selectConverter();
            readResult();
            Thread.sleep(5000);
        }
    }
    void downloadData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("HELLO IN MY UNIT CONVERTER!");
        System.out.println("---------------------------");
        System.out.println("What you want to do?");
        System.out.println("[1]cm   ->  m");
        System.out.println("[2]m    ->  cm");
        System.out.println("[3]mm   ->  cm");
        System.out.println("[4]cm   ->  mm");
        System.out.println("[5]mil  ->  km");
        System.out.println("[6]km   ->  mil");
        System.out.println("[7]'C   ->  'F");
        System.out.println("[8]'F   ->  'C");
        System.out.println("[9]m    ->  km");
        System.out.println("[10]km  ->  m");
        System.out.println("[11]Wylacz system!");
        System.out.println("");
        this.id = scan.nextInt();

        if(this.id!=11)
        {
            System.out.println("Data to Converter: ");
            this.data = scan.nextDouble();
        }
    }
    void selectConverter()
    {
        switch(id)
        {
            case 1:
                cmToM(data);
                break;
            case 2:
                mToCm(data);
                break;
            case 3:
                mmToCm(data);
                break;
            case 4:
                cmToMm(data);
                break;
            case 5:
                milToKm(data);
                break;
            case 6:
                kmToMil(data);
                break;
            case 7:
                CToF(data);
                break;
            case 8:
                FToC(data);
                break;
            case 9:
                mToKm(data);
                break;
            case 10:
                kmToM(data);
                break;
            case 11:
                this.check = false;
                System.out.println("END");
                System.exit(0);
                break;
            default:
                // throw("Error");
                System.out.println("ERROR");
                break;

        }
    }

    void cmToM(double data)
    {
        this.converterData = data/100.0;
    }

    void mToCm(double data)
    {
        this.converterData =  data*100.0;
    }

    void mmToCm(double data)
    {
        this.converterData =  data/100.0;
    }

    void cmToMm(double data)
    {
        this.converterData =  data*100.0;
    }

    void milToKm(double data)
    {
        this.converterData =  data*1.609;
    }

    void kmToMil(double data)
    {
        this.converterData =  data*0.6215;
    }

    void CToF(double data)
    {
        this.converterData =  data*1.8+32;
    }

    void FToC(double data)
    {
        this.converterData =  (data*-32)/1.8;
    }

    void mToKm(double data)
    {
        this.converterData = data/1000.0;
    }

    void kmToM(double data)
    {
        this.converterData = data*1000.09;
    }
    void readResult()
    {
        System.out.println("------------------------------");
        System.out.println("The result units converter is: " + this.converterData);
    }



}
