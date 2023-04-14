package stringsDemo;

public class main {

	public static void main(String[] args) {
		String message = "Today, weather is so good.";
		System.out.println(message);

		System.out.println("Numbers of elements: " + message.length()); //Mesaj uzunluğunu söyler
		System.out.println("5.Elements: " + message.charAt(4)); //Mesajın istenilen harfini söyler
		System.out.println(message.concat(" Hooray!")); //Mesaja mesaj ekler
		System.out.println(message.startsWith("T")); //Eğer mesaj B harfli ile başlıyorsa True döner! (boolean)
		System.out.println(message.endsWith(".")); //Eğer mesaje "." ile bitiyorsa True döner! (boolean)
		
		char[] letters = new char[5];
		message.getChars(0/*Başlar*/, 5/*Sonuncusunu alır*/, letters/*Atılacak küme*/, 0/*Kümenin kaçıncı sırası*/); //Bir Stringin harflerini almaya yarar.
		System.out.println(letters);
		
		System.out.println(message.indexOf("he")); //Sol taraftan aramaya başlar ve bulana kadar sürer.
		System.out.println(message.lastIndexOf("is")); //Sağ taraftan aramaya başlar ve bulana kadar sürer.
		
		System.out.println(message.replace(' ', '-')); //İlk taraftaki durumu ikinci hale getirir.
		System.out.println(message.substring(2)); //Mesajın ikinci indexten itibaren alır.
		System.out.println(message.substring(2, 5)); //Mesajin ikinci ve beşinci indexinden itibaren alır.
		
		for(String letter : message.split(" ")) //Her boşluktan sonrasını ayrı bir index alıp kümeye atar.
		{
			System.out.println(letter);
		}
		
		System.out.println(message.toLowerCase()); //Tüm mesajı küçük harf ile yazar.
		System.out.println(message.toUpperCase()); //Tüm mesaji büyük harf ile yazar.
		System.out.println(message.trim()); //Mesajin başındaki ve sonundaki boşlukları görmezden gelip yazar.
	}

}
