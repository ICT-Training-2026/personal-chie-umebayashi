package animal;

public class Animal{
	private String name;
	private int age;
	
	//コンストラクタ
	public Animal() {
		name = "noName";
		age = 999;
		System.out.println("なまえ と ねんれい が 未設定です");
		System.out.println("現在の名前："+ this.name + "　現在の年齢：" + this.age);
	}
	
	public void display() {
		System.out.println("Animalです");
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("現在の名前："+ this.age + "　現在の年齢：" + this.age);
	}
	
	//ゲッター：名前
	public String getName() {
		return name;
	}
	
	//セッター：名前
	public void setName(String name) {
		this.name = name;
	}
	
	//ゲッター：年齢
	public int getAge() {
		return age;
	}
	
	//セッター：年齢
	public void setAge(int age) { 
		this.age = age;
	}
}
