package nightingale.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class NInput implements KeyListener{
	@Override
	public void keyPressed(KeyEvent e) {
		toggleKey(e.getKeyCode(), false);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		toggleKey(e.getKeyCode(), false);
	}

	@Override
	public void keyTyped(KeyEvent e) {}	
	
	/**
	 * @param keyCode
	 * @param isPressed
	 */
	public abstract void toggleKey(int keyCode, boolean isPressed);
	
}