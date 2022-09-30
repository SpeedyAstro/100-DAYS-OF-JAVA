# Byte Streams Classes 

	1. FileInput Stream & FileOutput Stream
	2. ByteArrayInputStream & ByteArrayOutputStream
	3. FilterInputStream & FilterOutputStream
	4. DataInputStream & DataOutputStream
	5. BufferedInpuStream & BufferedOutputStream
	6. PushBackInputStream
	7. PrintStream
	8. PipedInputStream & PipedOutputStream



### FileInputStream
- FileInputStream is used to read the data for eg text, image, video, audio etc in the form of bytes
- FileInputStream can read the character stream data also, but you should use FileReader to read character type of data
- if file/data is not found, then it will throw FileNotFoundException

### FileOutputStream
- FileOutputStream is used to write the data for eg text, image, video, audio etc in the form of bytes
- FileOutputStream can read the character stream data also but you should use FileWriter to write character stream data
- if file is not found, then it will create new file.

### ByteArrayInputStream
- ByteArray + InputStream : As name suggests, ByteArrayInputStream can be used to read ByteArray data only as an input stream
- ByteArrayInputStream uses internal buffer to read the byte array data

### ByteArrayOutputStream
- ByteArrayOutputStream is used to write the common data to multiple files

### FilterInputStream
FileInputStream is less used because it provides sub-classes for more functionalities i.e. DataInputStream, BufferedInputStream & PushBackInputStream

### FilterOutputStream
- FilterOutputStream is less used because it provides sub-class for more functionalities i.e. DataOutputStream, BufferedOutputStream & PrintStream

### DataInputStream
DataInputStream is used to read the primitive data from input stream in a machine-independent way

### DataOutputStream
DataOutputStream is used to write the primitive data form input stream in a machineindependent way

### BufferedInputStream
In this case buffer machanish is used internally which will improve the performance

### BufferedOutputStream
- BufferedOutputStream also use buffer to write the data in order to improve 
- the performance
- (flush() method is used forcefully write the data into the stream or output before erasing the buffer memory)

### PushBackInputStream
PushBackInputStream can be used to unread a byte which is already read and push back one byte

### PrintStream
PrintStream provides the methods to write the data into another stream
PrintStream class automatically flushes the data so there is no need to use flush() method
PrintStream method does not throw IOException

### PipedInputStream & PipedOutputStream
PipedInputStream and PipedOutputStream are used simultaneously
These streams are used to transfer the data from one thread to another thread
Both these streams should be connected

### ObjectInputStream & ObjectOutputStream
These streams are used in serialization


