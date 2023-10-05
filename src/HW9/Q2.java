package HW9;

//熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。

class Account {
	private int money = 0; 
	
	synchronized public void remit(int ntd) {
		while (money > 3000) {
			System.out.println("帳戶餘額超過3000，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += ntd;
		System.out.println("匯款金額: " + ntd + "; 帳戶餘額: " + money);
		notify();
	}
	
	synchronized public void use(int ntd) {
		while (money < ntd) {
			System.out.println("帳戶餘額不足，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= ntd;
		System.out.println("提款金額: " + ntd + " ; 帳戶餘額: " + money);
		if (money < 2000) {
			System.out.println("餘額不足，催促匯款");
			notify();
		}
	}
}

class Mom extends Thread {
	Account account;
	
	public Mom(Account account) {
		this.account = account;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.remit(2000);
		}
	}
}

class Son extends Thread {
	Account account;
	
	public Son(Account account) {
		this.account = account;
	}
	
	public void run() {
		for (int i = 1; i <=10; i++) {
			account.use(1000);
		}
	}
	
}

public class Q2 {
	public static void main (String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		mom.start();
		son.start();
	}

}
