package model;
import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import controller.LoginScreenActivity;

/**
 * Created by Andrew on 6/14/2017.
 */

public class FileSave {


    public static void fileSave(Context c) throws IOException {
        ArrayList<User> loadUsers = User.getUsers();
        String newLine = "\n";
        FileOutputStream fos = c.openFileOutput("Users.txt", Context.MODE_PRIVATE);
        for (User user: loadUsers) {
            String msg = user.toString() + newLine;
            fos.write(msg.getBytes());
        }
        //fos.write(msg.getBytes());
            fos.close();
    }
}
