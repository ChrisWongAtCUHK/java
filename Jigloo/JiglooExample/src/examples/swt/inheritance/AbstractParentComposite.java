package examples.swt.inheritance;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.SWT;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

import com.cloudgarden.resource.SWTResourceManager;

/**
 * This is an abstract superclass demonstrating Jigloo's ability to
 * handle extension of abstract visual classes.
 */
public abstract class AbstractParentComposite extends Composite {

	{
		//Register as a resource user - SWTResourceManager will
		//handle the obtaining and disposing of resources
		SWTResourceManager.registerResourceUser(this);
	}

	public Group group1;
	private Button button1;

	/**
	* Auto-generated main method to display this 
	* org.eclipse.swt.widgets.Composite inside a new Shell.
	*/
	public static void main(String[] args) {
		showGUI();
	}
		
	public abstract String getTitle();
	
	/**
	* Auto-generated method to display this 
	* org.eclipse.swt.widgets.Composite inside a new Shell.
	*/
	public static void showGUI() {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		
		//create an anonymous class instance of ParentComposite which
		//implements the abstract method - just for testing.
		AbstractParentComposite inst = new AbstractParentComposite(shell, SWT.NULL) {
			public String getTitle() {
				return "Just Testing!";
			}
		};
		
		Point size = inst.getSize();
		shell.setLayout(new FillLayout());
		shell.setText("This is the Abstract Parent Composite");
		shell.layout();
		if(size.x == 0 && size.y == 0) {
			inst.pack();
			shell.pack();
		} else {
			Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
			int MENU_HEIGHT = 22;
			if (shell.getMenuBar() != null)
				shellBounds.height -= MENU_HEIGHT;
			shell.setSize(shellBounds.width, shellBounds.height);
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}

	public AbstractParentComposite(Composite parent, int style) {
		super(parent, style);
		initGUI();
	}

	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout();
			this.setLayout(thisLayout);
			thisLayout.numColumns = 2;
			this.setBackground(SWTResourceManager.getColor(192, 192, 192));
			this.setSize(273, 151);
			{
				group1 = new Group(this, SWT.NONE);
				GridLayout group1Layout = new GridLayout();
				GridData group1LData = new GridData();
				group1LData.grabExcessVerticalSpace = true;
				group1LData.verticalAlignment = GridData.FILL;
				group1LData.grabExcessHorizontalSpace = true;
				group1LData.horizontalAlignment = GridData.FILL;
				group1.setLayoutData(group1LData);
				group1.setBackground(SWTResourceManager.getColor(128, 0, 255));
				group1Layout.makeColumnsEqualWidth = true;
				group1.setLayout(group1Layout);
				group1.setText(getTitle());
				{
					button1 = new Button(group1, SWT.PUSH | SWT.CENTER);
					button1.setText("Push Me!");
					GridData button1LData = new GridData();
					button1LData.horizontalAlignment = GridData.FILL;
					button1.setLayoutData(button1LData);
				}
			}
			this.layout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Button getButton1() {
		return button1;
	}

}
