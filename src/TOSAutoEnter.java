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
			System.out.println("剩餘" + loop + "次");
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(56, 488);// 光塔
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);// 光一封
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(56, 488);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(159, 240);// 光1-3
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(3000);// 選戰友
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(159, 240);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(155, 397);// 確認戰友
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(319, 586);// 進關
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
		System.out.println("體力耗盡");
	}

	void fireSlime(int n) throws AWTException, InterruptedException {
		a = 5;
		loop = (int) n / a;
		if (loop > (int) n / a)
			loop--;
		for (; loop >= 0; loop--) {
			botf = new Robot();
			int c = 15;
			System.out.println("剩餘" + loop + "次");
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(304, 289);// 火塔
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);// 火一封
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(62, 470);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);// 火1-3
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(3000);// 選戰友
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(155, 397);// 確認戰友
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(319, 586);// 進關
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
		System.out.println("體力耗盡");
	}

	void darkSlime(int n) throws AWTException, InterruptedException {
		a = 5;
		loop = (int) n / a;
		if (loop > (int) n / a)
			loop--;
		for (; loop >= 0; loop--) {
			botf = new Robot();
			int c = 15;
			System.out.println("剩餘" + loop + "次");
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(328, 424);// 暗塔
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);// 暗一封
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(65, 468);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);// 暗1-3
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(3000);// 選戰友
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(135, 237);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(155, 397);// 確認戰友
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(2000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(319, 586);// 進關
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);// 移開滑鼠避免影響轉珠
			while (true) {
				boolean ifcon = ifContinue(c);
				if (ifcon == true) {
					break;
				}
			}
		}
		System.out.println("體力耗盡");
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
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 選擇戰友
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
			botf.mouseMove(155, 397);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 確認戰友
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
			botf.mouseMove(319, 592);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 進關
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
		System.out.println("體力耗盡");
	}

	boolean ifContinue(int c) throws InterruptedException, AWTException {
		if (c == 0) {
			botf = new Robot();
			System.out.print("程式錯誤，自動關閉");
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
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 繼續
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 403);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 結算
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 403);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 掉落
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 取消
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4000);
			return true;
		} else if (color2.getRed() <= 20 && color2.getRed() >= 4
				&& color2.getBlue() <= 120 && color2.getBlue() >= 101
				&& color2.getGreen() <= 90 && color2.getGreen() >= 74) {
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 413);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 繼續
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 413);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 結算
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 413);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 掉落
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 取消
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4000);
			return true;
		} else if (color3.getRed() <= 20 && color3.getRed() >= 4
				&& color3.getBlue() <= 120 && color3.getBlue() >= 101
				&& color3.getGreen() <= 90 && color3.getGreen() >= 74) {
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 423);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 繼續
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 423);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 結算
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 423);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 掉落
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 取消
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4000);
			return true;
		} else if (color4.getRed() <= 20 && color4.getRed() >= 4
				&& color4.getBlue() <= 120 && color4.getBlue() >= 101
				&& color4.getGreen() <= 90 && color4.getGreen() >= 74) {
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 433);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 繼續
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 433);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 結算
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(6000);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(152, 433);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 掉落
			botf.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			botf.mouseMove(mouse.x, mouse.y);
			Thread.sleep(4500);
			mouse = MouseInfo.getPointerInfo().getLocation();
			botf.mouseMove(228, 432);
			botf.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 取消
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
		// TOSAutoEnter.getMousePosition();// 獲取滑鼠座標
		// TOSAutoEnter.getPositionRGB();//獲取指定座標RGB值
		// dragTest();
		System.out.println("程式初始化中...");
		System.out.println("請將BS置於畫面左上方");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		feeding fd = new feeding();
		System.out.println("封塔選擇:水火木光暗+1234567:");
		br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("請輸入目前體力");
		br = new BufferedReader(new InputStreamReader(System.in));
		i = Integer.valueOf(br.readLine().toString());
		switch (str) {
		case "光1":
			System.out.println("程式執行期間請勿將游標置於BS上方");
			fd.lightSlime(i);
			break;
		case "暗2":
			System.out.println("程式執行期間請勿將游標置於BS上方");
			fd.darkPaladin(i);
			break;
		case "暗1":
			System.out.println("程式執行期間請勿將游標置於BS上方");
			fd.darkSlime(i);
			break;
		case "火1":
			System.out.println("程式執行期間請勿將游標置於BS上方");
			fd.fireSlime(i);
			break;
		}

	}

	public static void getMousePosition() {
		Point mouse = MouseInfo.getPointerInfo().getLocation();
		System.out.println("X軸座標:" + mouse.x);
		System.out.println("Y軸座標:" + mouse.y);
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
