#### Stream  [Recap]
1. Byte Stream 
		1.  Input Stream
		2. Output Stream
2. Character Stream 
		1. Reader
		2. Writer

# *File Handling*

#### Ways to Read Data from file
							1. Sequential Access : Read and write data sequentially , ie. from beginning of file.
							2. Random Access : Manipulation from any location in the file.


`java.io.File` and other java classes provide facility to perform these operations.

### Creating & Deleting File 
``` JAVA
public class FileHandlin {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\pande\\Documents\\kachra\\test.txt");

        Boolean b = f.createNewFile(); // do not create if file is existing with same name 
        if(b) System.out.println("File Created!!!");
        else System.out.println("An Error Occured");
		f.delete() // delete the file
    }

}
```

### Rename File
```JAVA
public class FileHandlin {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\pande\\Documents\\kachra\\test.txt");
        File f2 = new File("C:\\Users\\pande\\Documents\\kachra\\Modified.txt");

        Boolean b = f.renameTo(f2); // do not create if file is existing with same name 
        if(b) System.out.println("File Created!!!");
        else System.out.println("An Error Occured");

    }

}
```

### Get Size of Empty Space of drive
```java
public class FileHandlin {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\");

        long l = f.getFreeSpace(); // get Free space
        long totat_space = f.getTotalSpace(); // get total space of drive

        System.out.println(l/(1024*1024*1024)); // In Gigabytes
		System.out.println(totat_space/(1024*1024*1024));
    }

}
```

### Get File Size
```JAVA
public class FileHandlin {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\pande\\Documents\\kachra\\test.txt");

        long l = f.length();
		System.out.println(l);
    }

}
```

### Get File List in a Directory
```JAVA
public class FileHandlin {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\pande\\Documents");
		Str
        String [] str = f.list();
		for(int i = 0 ; i < str.length; i++){
			System.out.println(str[i]);
		}
    }

}
```

### File Filter
```java
        String extension = ".txt";

        String s1[] = f.list(new FilenameFilter() {

  

            @Override

            public boolean accept(File dir, String name) {

                return name.endsWith(extension);

            }

        });

        for(String c : s1){

            System.out.println(c);

        }
```

### Make File ReadOnly
```java
import java.io.File;

  

public class MakeReadOnlyfile {

    public static void main(String[] args) {

        File f=  new File("C:\\Users\\pande\\Documents\\kachra\\test.txt");

        f.setReadOnly();

    }

}
```

### Make File Hidden
```java
import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.LinkOption;

import java.nio.file.Path;

import java.nio.file.Paths;

public class MakeFileHidden {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("C:\\Users\\pande\\Documents\\kachra\\test.txt");

        Files.setAttribute(p, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);

    }

}
```

## Random Access
To read and write the files in random way, we have to use "java.io.RandomAccessFile" class
There can permissions i.e "r" or "rw"
writeXXX(XXX value) 
readXXX(XXX value) 
seek(long pos)