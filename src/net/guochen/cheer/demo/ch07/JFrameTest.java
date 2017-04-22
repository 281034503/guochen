package net.guochen.cheer.demo.ch07;
      import javax.swing.JFrame;
public class JFrameTest {
	public static void main(String[] args){
		
		new DemoFrame();
		
	}

}
class DemoFrame extends JFrame{
		
	private static final long serialVersionUID = 1L;

		public DemoFrame(){
			this.setTitle("Hello My JFrame");
			this.setSize(400, 300);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
		}
	
}