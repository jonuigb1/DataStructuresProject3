package westga.edu.CS3151.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.stage.FileChooser;

public class Directory {
	private static ArrayList<String> list;

	private static void addFiles(File dir) {
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				list.add(file.getAbsolutePath());
				if (file.isDirectory()) {
					addFiles(file);
				}
			}
		}
	}

	public static void main(String[] args) {

		list = new ArrayList<String>();
		FileChooser chooser = new FileChooser();
		chooser.getInitialDirectory();
		chooser.getInitialFileName();
		chooser.getCurrentDirectory();
		String fullPath = file.getCanonicalPath(); 
		chooser.setAcceptAllFileFilterUsed(false);
		int value = chooser.showOpenDialog(null);
		if (value != FileChooser.APPROVE_OPTION) {
			return;
		}
		addFiles(chooser.getSelectedFile());
		for (String name : list) {
			System.out.println(name);
		}

	}
	
	 public void search(String name,File file)
	    {
	        File[] list = file.listFiles();
	        if(list!=null)
	        for (File files : list)
	        {
	            if (files.isDirectory())
	            {
	                search(name,files);
	            }
	            else if (name.equalsIgnoreCase(files.getName()))
	            {
	                System.out.println(files.getParentFile());
	            }
	        }
	    }
	    public static void mains(String[] args) {
	    	
         Directory ff = new Directory();
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the file to be searched.. " );
	        String name = scan.next();
	        System.out.println("Enter the directory where to search ");
	        String directory = scan.next();
	        ff.search(name,new File(directory));
	    }
	


	


	
	
	

}
