/**
 * 
 */
package textgenerator;

import java.awt.Graphics;
import javax.swing.JPanel;

import textgenerator.CommonConfiguration;


/**
 * @author so
 *
 */
public class DrawPanel extends JPanel {
	
	private int scale;
	
	private CommonConfiguration commonConf;
	
	DrawPanel(CommonConfiguration _cg ){
		super();
		commonConf = _cg;
		setScale(0);
	}
	
	@Override public void paintComponent(Graphics g) {
		int itr; 
				
        super.paintComponent(g); // <-- HERE!
        
        if( commonConf != null ){
        	itr = commonConf.getNumOfMasters();
        } else {
        	itr = 0;
        }
        
        for(int i = 0; i < itr ; i++){
       	    //g.drawOval(50+i*5, 50, 50, 50);
       	    g.drawRect(50 + i * 150, 50, 100, 50);
        }
    }

	/**
	 * @return commonConf
	 */
	public CommonConfiguration getCommonConf() {
		return commonConf;
	}

	/**
	 * @param commonConf セットする commonConf
	 */
	public void setCommonConf(CommonConfiguration commonConf) {
		this.commonConf = commonConf;
	}

	/**
	 * @return scale
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * @param scale セットする scale
	 */
	public void setScale(int scale) {
		this.scale = scale;
	}
	
}
