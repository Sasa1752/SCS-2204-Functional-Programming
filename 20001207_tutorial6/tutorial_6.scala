//Encryption and Decryption according to Caesar cipher
object CeasarCipher extends App{

   //function for encryption
   def encrypt(text:String,shift:Int):String = text.length() match {
       case 0 => ""
       case _ if(text.head<= 'Z' && text.head >= 'A')=> (65 + (text.head.toUpper.toChar.toInt+shift-65)%26).toChar + encrypt(text.tail,shift)
       case _ if(text.head<= 'z' && text.head >= 'a')=> (97 + (text.head.toLower.toChar.toInt+shift-97)%26).toChar + encrypt(text.tail,shift)
       case _ => text.head + encrypt(text.tail,shift)  
   }

   //function for decryption
   def decrypt(text:String,shift:Int):String = text.length() match{
      case 0 => ""
      case _ if(text.head <= 'Z' && text.head >= 'A') => (65 + (text.head.toUpper.toChar.toInt+26-shift-65)%26).toChar + decrypt(text.tail,shift)
      case _ if(text.head<= 'z' && text.head >= 'a')=> (97 + (text.head.toLower.toChar.toInt+26-shift-97)%26).toChar + decrypt(text.tail,shift)
      case _ => text.head + decrypt(text.tail,shift)
   }

   //takes encrypt and decrypt functions to process the data.
   def cipher(text:String,shift:Int, func: (String,Int)=>String):String = {
      func(text,shift)
   }
   
   //take input text which need to encrypt/decrypt
   print("Enter the text:")
   var input = scala.io.StdIn.readLine();

   //take how many characters need to shift
   print("Enter shift:")
   var shift= scala.io.StdIn.readInt();

   //take which operation need to do encrypt/decrypt
   println("Enter 1 for encrypt and 2 for decrypt")
   print("Select encrypt or decrypt:")
   var choice = scala.io.StdIn.readInt(); 

   //check the user choice encrypt/decrypt and call cipher function for relavant input,shift and choice
   choice match{
      case 1 => println(cipher(input,shift,encrypt))
      case 2 => println(cipher(input,shift,decrypt))
   } 

}