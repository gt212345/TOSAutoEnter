import java.awt.AWTException;
import java.awt.Color;
import java.awt.Event;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class feeding {
	Robot botf;
	int a, n, loop;
	boolean ifcon;
	Point mouse;

	void lightSlime(int n) throws AWTException, InterruptedException {
		a = 5;
		loop = (int) n / a;
		if (loop > (int) n / a)
			loop--;
		for (; loop >= 0; loop--) {
			botf = new Robot();
			int c = 15;
			System.out.println("�Ѿl" + loop + "��");
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(56, 488);// ����
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);// ���@��
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(56, 488);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(159, 240);// ��1-3
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(3000);// ��Ԥ�
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(159, 240);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(155, 397);// �T�{�Ԥ�
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(319, 586);// �i��
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			while (true) {
				boolean ifcon = ifContinue(c);
				if (ifcon == true) {
					break;
				}
			}
		}
		System.out.println("��O�Ӻ�");
	}

	void fireSlime(int n) throws AWTException, InterruptedException {
		a = 5;
		loop = (int) n / a;
		if (loop > (int) n / a)
			loop--;
		for (; loop >= 0; loop--) {
			botf = new Robot();
			int c = 15;
			System.out.println("�Ѿl" + loop + "��");
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(304, 289);// ����
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);// ���@��
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(62, 470);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);// ��1-3
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(3000);// ��Ԥ�
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(155, 397);// �T�{�Ԥ�
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(319, 586);// �i��
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			while (true) {
				boolean ifcon = ifContinue(c);
				if (ifcon == true) {
					break;
				}
			}
		}
		System.out.println("��O�Ӻ�");
	}

	void darkSlime(int n) throws AWTException, InterruptedException {
		a = 5;
		loop = (int) n / a;
		if (loop > (int) n / a)
			loop--;
		for (; loop >= 0; loop--) {
			botf = new Robot();
			int c = 15;
			System.out.println("�Ѿl" + loop + "��");
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(328, 424);// �t��
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);// �t�@��
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(65, 468);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);// �t1-3
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(3000);// ��Ԥ�
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(155, 397);// �T�{�Ԥ�
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(319, 586);// �i��
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);// ���}�ƹ��קK�v�T��]
			while (true) {
				boolean ifcon = ifContinue(c);
				if (ifcon == true) {
					break;
				}
			}
		}
		System.out.println("��O�Ӻ�");
	}

	void darkPaladin(int n) throws InterruptedException, AWTException {
		int a = 5;
		int loop = (int) n / a;
		if (loop > (int) n / a)
			loop--;
		for (; loop >= 0; loop--) {
			botf = new Robot();
			int c = 15;
			botf.mouseMove(328, 424);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
			botf.mouseMove(112, 404);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
			botf.mouseMove(119, 475);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(3000);
			botf.mouseMove(159, 240);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ��ܾԤ�
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
			botf.mouseMove(155, 397);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// �T�{�Ԥ�
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
			botf.mouseMove(319, 592);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// �i��
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(319, 900);
			while (true) {
				ifcon = ifContinue(c);
				if (ifcon == true) {
					break;
				}
				c--;
			}
		}
		System.out.println("��O�Ӻ�");
	}

	boolean ifContinue(int c) throws InterruptedException, AWTException {
		if (c == 0) {
			botf = new Robot();
			System.out.print("�{�����~�A�۰�����");
			System.exit(0);
		}
		Color color1 = botf.getPixelColor(152, 403);
		Color color2 = botf.getPixelColor(152, 413);
		Color color3 = botf.getPixelColor(152, 423);
		Color color4 = botf.getPixelColor(152, 433);
		if (color1.getRed() <= 20 && color1.getRed() >= 4
				&& color1.getBlue() <= 120 && color1.getBlue() >= 101
				&& color1.getGreen() <= 90 && color1.getGreen() >= 74) {
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 403);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// �~��
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 403);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 403);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4000);
			return true;
		} else if (color2.getRed() <= 20 && color2.getRed() >= 4
				&& color2.getBlue() <= 120 && color2.getBlue() >= 101
				&& color2.getGreen() <= 90 && color2.getGreen() >= 74) {
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 413);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// �~��
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 413);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 413);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4000);
			return true;
		} else if (color3.getRed() <= 20 && color3.getRed() >= 4
				&& color3.getBlue() <= 120 && color3.getBlue() >= 101
				&& color3.getGreen() <= 90 && color3.getGreen() >= 74) {
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 423);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// �~��
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 423);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 423);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4000);
			return true;
		} else if (color4.getRed() <= 20 && color4.getRed() >= 4
				&& color4.getBlue() <= 120 && color4.getBlue() >= 101
				&& color4.getGreen() <= 90 && color4.getGreen() >= 74) {
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 433);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// �~��
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 433);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 433);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// ����
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4000);
			return true;
		} else {
			Thread.sleep(20000);
			return false;
		}
	}

	class skillLeveling {

	}
}

public class TOSAutoEnter {
	static int i;

	public static void main(String[] args) throws AWTException,
			InterruptedException, IOException {
		// TODO Auto-generated method stub
		// TOSAutoEnter.getMousePosition();// ����ƹ��y��
		// TOSAutoEnter.getPositionRGB();//������w�y��RGB��
		// dragTest();
		System.out.println("�{����l�Ƥ�...");
		System.out.println("�бNBS�m��e�����W��");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		feeding fd = new feeding();
		System.out.println("�ʶ���:��������t+1234567:");
		br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("�п�J�ثe��O");
		br = new BufferedReader(new InputStreamReader(System.in));
		i = Integer.valueOf(br.readLine().toString());
		switch (str) {
		case "��1":
			System.out.println("�{����������ФűN��иm��BS�W��");
			fd.lightSlime(i);
			break;
		case "�t2":
			System.out.println("�{����������ФűN��иm��BS�W��");
			fd.darkPaladin(i);
			break;
		case "�t1":
			System.out.println("�{����������ФűN��иm��BS�W��");
			fd.darkSlime(i);
			break;
		case "��1":
			System.out.println("�{����������ФűN��иm��BS�W��");
			fd.fireSlime(i);
			break;
		}

	}

	public static void getMousePosition() {
		Point mouse = MouseInfo.getPointerInfo().getLocation();
		System.out.println("X�b�y��:" + mouse.x);
		System.out.println("Y�b�y��:" + mouse.y);
	}

	public static void getPositionRGB() throws AWTException {
		Robot bottest = new Robot();
		Color colortest = bottest.getPixelColor(152, 413);
		System.out.println(colortest.getRed());
		System.out.println(colortest.getBlue());
		System.out.println(colortest.getGreen());
	}

	public static void dragTest() throws AWTException, InterruptedException {
		Robot rr = new Robot();
		rr.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(200);
		rr.mouseMove(0, 400);
		Thread.sleep(200);
		rr.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
