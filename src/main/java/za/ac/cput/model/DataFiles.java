package za.ac.cput.model;

import java.io.*;

public class DataFiles implements Serializable {
    int one;
    int two;

    // Checks if INVENTORY file is there or not. If its not there, all files are created.
    public void checkFile() {
        do {
            try {
                ObjectInputStream input;
                input = new ObjectInputStream( new FileInputStream( "INVENTORY.ser" ) );
                DataFiles record;
                record = ( DataFiles ) input.readObject();
                input.close();
            }
            catch(Exception e) {
                one = 1;
            }
            finally {
                two = 2;
            }
        }
        while(two != 2);
    }

    public void createUserFile() {
        if(one == 1)
            try {
                ObjectOutputStream output ;
                output = new ObjectOutputStream( new FileOutputStream( "USER.ser" ) );
                output.close();
            }
            catch (IOException ioe) {
                System.out.println(ioe);
            }
    }

    public void createInventoryFile() {
        if(one == 1)
            try {
                ObjectOutputStream output ;
                output = new ObjectOutputStream( new FileOutputStream( "INVENTORY.ser" ) );
                output.close();
            }
            catch (IOException ioe) {
                System.out.println(ioe);
            }
    }

    public void createStockFile() {
        if(one == 1)
            try {
                ObjectOutputStream output = null;
                output = new ObjectOutputStream( new FileOutputStream( "STOCKTAKE.ser" ) );
                output.close();
            }
            catch (Exception e) {
                System.out.println(e);
            }
    }


    public void createStockTemp() {
        if(one == 1)
            try {
                ObjectOutputStream output ;
                output = new ObjectOutputStream( new FileOutputStream( "STOCKTAKE_TEMP.ser" ) );
                output.close();
            }
            catch (IOException ioe) {
                System.out.println(ioe);
            }
    }

    public void createPurchasesFile() {
        if(one == 1)
            try {
                ObjectOutputStream output ;
                output = new ObjectOutputStream( new FileOutputStream( "PURCHASES.ser" ) );
                output.close();
            }
            catch (IOException ioe) {
                System.out.println(ioe);
            }
    }

    public void createBreakagesFile() {
        if(one == 1)
            try {
                ObjectOutputStream output ;
                output = new ObjectOutputStream( new FileOutputStream( "BREAKAGES.ser" ) );
                output.close();
            }
            catch (IOException ioe) {
                System.out.println(ioe);
            }
    }

    public void createSalesFile() {
        if(one == 1)
            try {
                ObjectOutputStream output ;
                output = new ObjectOutputStream( new FileOutputStream( "SALES.ser" ) );

                output.close();
            }
            catch (IOException ioe) {
                System.out.println(ioe);
            }
    }

    public void createAllFiles() {
        checkFile();

        createUserFile();
        createStockTemp();
        createBreakagesFile();
        createInventoryFile();
        createPurchasesFile();
        createSalesFile();
        createStockFile();
        System.out.println("Files created");

    }

}
