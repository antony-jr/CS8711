import java.util.Calendar;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.Log;

public class Program {
  
   // The Cloudlet List.
   private static List<Cloudlet> cloudletList; 

   // The Virtual Machine List.
   private static List<Vm> vmList;

   public static void main(String [] args) {
      Log.printLine("Starting Simulation... ");

      try {

      } catch(Exception e) {
	 Log.printLine("Unwanted Errors.");
	 e.printStackTrace();
      }
   }
}
