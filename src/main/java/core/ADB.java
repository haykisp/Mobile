package core;

import core.managers.ServerManager;

import java.io.IOException;
import java.util.Scanner;

public class ADB {

    public static String command(String command){
        if (command.startsWith("adb")) command = command.replace("adb", ServerManager.getAndroidHome()+"/platform-tools/adb");
        else throw new RuntimeException("This method is designed to run ADB commands only !");
        String output = ServerManager.runCommand(command);
        if (output == null) return "";
        else return output;
    }


}
