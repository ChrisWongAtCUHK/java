package examples.swt.dummyeclipse;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridLayout;

import com.cloudgarden.resource.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.CoolItem;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.swt.custom.CTabFolderAdapter;
import org.eclipse.swt.custom.CTabFolderEvent;


public class DummyEclipse extends org.eclipse.swt.widgets.Composite {

	{
		//Register as a resource user - SWTResourceManager will
		//handle the obtaining and disposing of resources
		SWTResourceManager.registerResourceUser(this);
	}

	private CoolBar coolBar1;

	private ToolItem toolItem10;

	private MenuItem newMenuItem;

	private MenuItem helpContMenuItem;

	private Menu menu20;

	private MenuItem helpMenuItem;

	private MenuItem copyMenuItem;

	private MenuItem pasteMenuItem;

	private MenuItem cutMenuItem;

	private MenuItem separator1;

	private MenuItem redoMenuItem;

	private MenuItem undoMenuItem;

	private Menu menu15;

	private MenuItem editMenuItem;

	private MenuItem exitMenuItem;

	private MenuItem saveMenuItem;

	private MenuItem closeMenuItem;

	private MenuItem separator11;

	private MenuItem packageItem;

	private MenuItem menuItem5;

	private MenuItem projectItem;

	private Menu menu5;

	private Menu menu3;

	private MenuItem fileMenuItem;

	private TableItem tableItem2;

	private TableItem tableItem1;

	private TableColumn tableColumn4;

	private TableColumn tableColumn3;

	private Table table1;

	private ToolItem toolItem1;

	private ToolItem toolItem2;

	private ToolBar toolBar4;

	private CLabel cLabel7;

	private Composite composite14;

	private Composite composite12;

	private CTabItem cTabItem10;

	private CTabFolder cTabFolder6;

	private ScrolledComposite scrolledComposite1;

	private CTabItem cTabItem7;

	private Text text2;

	private CTabItem cTabItem6;

	private CTabFolder cTabFolder3;

	private TreeItem treeItem11;

	private TreeItem treeItem12;

	private TreeItem treeItem10;

	private Tree tree4;

	private CLabel cLabel5;

	private Composite composite10;

	private CTabItem cTabItem5;

	private TreeItem treeItem9;

	private TreeItem treeItem8;

	private TreeItem treeItem7;

	private Tree tree3;

	private ToolItem toolItem4;

	private ToolItem toolItem3;

	private ToolBar toolBar5;

	private CLabel cLabel4;

	private Composite composite9;

	private Composite composite7;

	private CTabItem cTabItem4;

	private CTabFolder cTabFolder2;

	private SashForm sashForm3;

	private SashForm sashForm2;

	private Composite composite6;

	private Label label2;

	private ToolItem toolItem12;

	private ToolItem toolItem11;

	private ToolItem sep11;

	private ToolItem toolItem9;

	private ToolBar toolBar3;

	private Composite composite13;

	private Composite composite8;

	private ToolItem runToolItem;

	private ToolItem debugToolItem;

	private ToolBar toolBar1;

	private CoolItem coolItem1;

	private ToolItem toolItem13;

	private ToolItem separator3;

	private ToolItem toolItem8;

	private ToolItem toolItem5;

	private ToolItem toolItem6;

	private ToolItem newToolItem;

	private ToolBar toolBar2;

	private CoolItem coolItem3;

	private Composite composite1;

	private Label label1;

	private Menu menu1;

	public DummyEclipse(Composite parent, int style) {
		super(parent, style);
		initGUI();
	}

	/**
	 * Initializes the GUI. Auto-generated code - any changes you make will
	 * disappear.
	 */
	public void initGUI() {
		try {
			preInitGUI();

			this.setSize(new org.eclipse.swt.graphics.Point(489, 353));

			GridLayout thisLayout = new GridLayout(1, true);
			this.setLayout(thisLayout);

			thisLayout.marginWidth = 0;
			thisLayout.marginHeight = 0;
			thisLayout.numColumns = 1;
			thisLayout.makeColumnsEqualWidth = true;
			thisLayout.horizontalSpacing = 0;
			thisLayout.verticalSpacing = 0;

			label1 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
			GridData label1LData = new GridData();
			label1LData.horizontalAlignment = GridData.FILL;
			label1LData.grabExcessHorizontalSpace = true;
			label1.setText("label1");
			label1.setLayoutData(label1LData);

			composite1 = new Composite(this, SWT.NONE);
			FillLayout composite1Layout = new FillLayout(
					org.eclipse.swt.SWT.HORIZONTAL);
			GridData composite1LData = new GridData();
			composite1LData.grabExcessHorizontalSpace = true;
			composite1LData.horizontalAlignment = GridData.FILL;
			composite1LData.verticalAlignment = GridData.BEGINNING;
			composite1LData.heightHint = 25;
			composite1.setLayout(composite1Layout);
			composite1.setLayoutData(composite1LData);
			composite1.layout();

			composite8 = new Composite(this, SWT.NONE);
			GridLayout composite8Layout = new GridLayout();
			composite8Layout.marginWidth = 0;
			composite8Layout.marginHeight = 0;
			composite8Layout.numColumns = 3;
			composite8Layout.horizontalSpacing = 2;
			composite8Layout.verticalSpacing = 0;
			GridData composite8LData = new GridData();
			composite8LData.grabExcessHorizontalSpace = true;
			composite8LData.grabExcessVerticalSpace = true;
			composite8LData.verticalAlignment = GridData.FILL;
			composite8LData.horizontalAlignment = GridData.FILL;
			composite8.setLayout(composite8Layout);
			composite8.layout();
			composite8.setLayoutData(composite8LData);

			composite13 = new Composite(composite8, SWT.NONE);
			GridLayout composite13Layout = new GridLayout();
			composite13Layout.marginWidth = 2;
			composite13Layout.marginHeight = 2;
			composite13Layout.makeColumnsEqualWidth = true;
			composite13Layout.horizontalSpacing = 0;
			composite13Layout.verticalSpacing = 2;
			GridData composite13LData = new GridData();
			composite13LData.widthHint = 25;
			composite13LData.verticalAlignment = GridData.FILL;
			composite13LData.grabExcessVerticalSpace = true;
			composite13.setLayoutData(composite13LData);
			composite13.setLayout(composite13Layout);
			composite13.layout();

			label2 = new Label(composite8, SWT.SEPARATOR);
			GridData label2LData = new GridData();
			label2LData.grabExcessVerticalSpace = true;
			label2LData.verticalAlignment = GridData.FILL;
			label2.setLayoutData(label2LData);

			composite6 = new Composite(composite8, SWT.NONE);
			GridLayout composite6Layout = new GridLayout();
			composite6Layout.marginWidth = 1;
			composite6Layout.marginHeight = 3;
			composite6Layout.makeColumnsEqualWidth = true;
			composite6Layout.horizontalSpacing = 2;
			composite6Layout.verticalSpacing = 2;
			GridData composite6LData = new GridData();
			composite6LData.grabExcessVerticalSpace = true;
			composite6LData.grabExcessHorizontalSpace = true;
			composite6LData.horizontalAlignment = GridData.FILL;
			composite6LData.verticalAlignment = GridData.FILL;
			composite6.setLayout(composite6Layout);
			composite6.layout();
			composite6.setLayoutData(composite6LData);

			sashForm2 = new SashForm(composite6, SWT.NONE);
			GridData sashForm2LData = new GridData();
			sashForm2LData.horizontalAlignment = GridData.FILL;
			sashForm2LData.grabExcessHorizontalSpace = true;
			sashForm2LData.verticalAlignment = GridData.FILL;
			sashForm2LData.grabExcessVerticalSpace = true;
			sashForm2.setOrientation(SWT.VERTICAL);
			sashForm2.setLayoutData(sashForm2LData);

			sashForm3 = new SashForm(sashForm2, SWT.NONE);

			cTabFolder6 = new CTabFolder(sashForm2, SWT.BOTTOM | SWT.BORDER);

			cTabItem10 = new CTabItem(cTabFolder6, SWT.NONE);
			cTabItem10.setText("Properties");

			cTabFolder6.setSelection(0);

			composite12 = new Composite(cTabFolder6, SWT.NONE);
			cTabItem10.setControl(composite12);
			GridLayout composite12Layout = new GridLayout();
			composite12Layout.marginWidth = 0;
			composite12Layout.marginHeight = 0;
			composite12Layout.makeColumnsEqualWidth = true;
			composite12Layout.horizontalSpacing = 0;
			composite12Layout.verticalSpacing = 0;
			composite12.setLayout(composite12Layout);
			composite12.layout();

			cTabFolder2 = new CTabFolder(sashForm3, SWT.BOTTOM | SWT.BORDER);

			cTabFolder3 = new CTabFolder(sashForm3, SWT.CLOSE | SWT.BORDER);

			cTabItem6 = new CTabItem(cTabFolder3, SWT.NONE);
			cTabItem6.setText("FakeJava.java");
			cTabItem6.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/jcu_obj.gif"));

			cTabItem7 = new CTabItem(cTabFolder3, SWT.NONE);
			cTabItem7.setText("FakeJava.form");
			cTabItem7.setImage(SWTResourceManager.getImage("examples/swt/dummyeclipse/icons/form.gif"));

			cTabFolder3.setSelection(0);
			cTabFolder3.addCTabFolderListener(new CTabFolderAdapter() {
				public void itemClosed(CTabFolderEvent evt) {
					System.out.println("cTabFolder3.itemClosed, event=" + evt);
					//TODO add your code for cTabFolder3.itemClosed
				}
			});
			//if using SWT 3.0
			//cTabFolder3.setSimple(false);

			scrolledComposite1 = new ScrolledComposite(cTabFolder3,
					SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
			cTabItem7.setControl(scrolledComposite1);

			text2 = new Text(cTabFolder3, SWT.MULTI | SWT.H_SCROLL
					| SWT.V_SCROLL);
			cTabItem6.setControl(text2);
			text2
					.setText("package fake;\n\npublic class FakeJava {\n\n\tpublic FakeJava() {\n\t}\n\n}");

			cTabItem4 = new CTabItem(cTabFolder2, SWT.NONE);
			cTabItem4.setText("Package Explorer");

			cTabItem5 = new CTabItem(cTabFolder2, SWT.NONE);
			cTabItem5.setText("Hierarchy");

			cTabFolder2.setSelection(0);

			composite10 = new Composite(cTabFolder2, SWT.NONE);
			cTabItem5.setControl(composite10);
			GridLayout composite10Layout = new GridLayout();
			composite10Layout.marginWidth = 0;
			composite10Layout.marginHeight = 0;
			composite10Layout.makeColumnsEqualWidth = true;
			composite10Layout.horizontalSpacing = 0;
			composite10Layout.verticalSpacing = 0;
			composite10.setLayout(composite10Layout);

			cLabel5 = new CLabel(composite10, SWT.NONE);
			GridData cLabel5LData = new GridData();
			cLabel5.setBackground(SWTResourceManager.getColor(192, 192, 192));
			cLabel5LData.horizontalAlignment = GridData.FILL;
			cLabel5LData.verticalAlignment = GridData.FILL;
			cLabel5LData.grabExcessHorizontalSpace = true;
			cLabel5.setText("Hierarchy Test");
			cLabel5.setImage(SWTResourceManager.getImage("examples/swt/dummyeclipse/icons/sample.gif"));
			cLabel5.setLayoutData(cLabel5LData);

			composite10.layout();

			composite7 = new Composite(cTabFolder2, SWT.NONE);
			cTabItem4.setControl(composite7);
			GridLayout composite7Layout = new GridLayout();
			composite7Layout.marginWidth = 0;
			composite7Layout.marginHeight = 0;
			composite7Layout.makeColumnsEqualWidth = true;
			composite7Layout.horizontalSpacing = 0;
			composite7Layout.verticalSpacing = 0;
			composite7.setLayout(composite7Layout);
			composite7.layout();

			toolBar3 = new ToolBar(composite13, SWT.FLAT | SWT.VERTICAL
					| SWT.V_SCROLL);
			GridData toolBar3LData = new GridData();
			toolBar3LData.verticalAlignment = GridData.FILL;
			toolBar3LData.grabExcessVerticalSpace = true;
			toolBar3LData.widthHint = 23;
			toolBar3.setLayoutData(toolBar3LData);

			toolItem9 = new ToolItem(toolBar3, SWT.NONE);
			toolItem9.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/new_persp.gif"));

			sep11 = new ToolItem(toolBar3, SWT.SEPARATOR);

			toolItem10 = new ToolItem(toolBar3, SWT.NONE);
			toolItem10.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/resource_persp.gif"));

			toolItem11 = new ToolItem(toolBar3, SWT.SEPARATOR);

			toolItem12 = new ToolItem(toolBar3, SWT.NONE);
			toolItem12.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/jperspective.gif"));

			composite14 = new Composite(composite12, SWT.NONE);
			GridLayout composite14Layout = new GridLayout();
			composite14Layout.marginWidth = 0;
			composite14Layout.marginHeight = 0;
			composite14Layout.numColumns = 2;
			composite14Layout.horizontalSpacing = 0;
			composite14Layout.verticalSpacing = 0;
			GridData composite14LData = new GridData();
			composite14LData.grabExcessHorizontalSpace = true;
			composite14LData.horizontalAlignment = GridData.FILL;
			composite14LData.verticalAlignment = GridData.FILL;
			composite14.setLayout(composite14Layout);
			composite14.layout();
			composite14.setLayoutData(composite14LData);

			table1 = new Table(composite12, SWT.CHECK);
			table1.setHeaderVisible(true);
			table1.setLinesVisible(true);
			GridData table1LData = new GridData();
			table1LData.grabExcessVerticalSpace = true;
			table1LData.grabExcessHorizontalSpace = true;
			table1LData.horizontalAlignment = GridData.FILL;
			table1LData.verticalAlignment = GridData.FILL;
			table1.setLayoutData(table1LData);

			tableColumn3 = new TableColumn(table1, SWT.NONE);
			tableColumn3.setText("Property");
			tableColumn3.setWidth(100);

			tableColumn4 = new TableColumn(table1, SWT.NONE);
			tableColumn4.setText("Value");
			tableColumn4.setWidth(100);

			tableItem1 = new TableItem(table1, SWT.NONE);
			tableItem1.setText("tableItem1");
			tableItem1.setChecked(true);

			tableItem2 = new TableItem(table1, SWT.NONE);
			tableItem2.setText("tableItem2");
			tableItem2.setGrayed(true);

			cLabel7 = new CLabel(composite14, SWT.NONE);
			GridData cLabel7LData = new GridData();
			cLabel7LData.grabExcessHorizontalSpace = true;
			cLabel7LData.horizontalAlignment = GridData.FILL;
			cLabel7LData.verticalAlignment = GridData.FILL;
			cLabel7.setText("Properties");
			cLabel7.setImage(SWTResourceManager.getImage("examples/swt/dummyeclipse/icons/prop_ps.gif"));
			cLabel7.setForeground(SWTResourceManager.getColor(255, 255, 255));
			cLabel7.setLayoutData(cLabel7LData);

			toolBar4 = new ToolBar(composite14, SWT.FLAT);
			GridData toolBar4LData = new GridData();
			toolBar4.setLayoutData(toolBar4LData);

			toolItem2 = new ToolItem(toolBar4, SWT.NONE);
			toolItem2.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/view_menu.gif"));

			toolItem1 = new ToolItem(toolBar4, SWT.NONE);
			toolItem1.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/close_view.gif"));

			tree4 = new Tree(composite10, SWT.NONE);
			GridData tree4LData = new GridData();
			tree4LData.grabExcessHorizontalSpace = true;
			tree4LData.grabExcessVerticalSpace = true;
			tree4LData.horizontalAlignment = GridData.FILL;
			tree4LData.verticalAlignment = GridData.FILL;
			tree4.setLayoutData(tree4LData);

			treeItem10 = new TreeItem(tree4, SWT.NONE);
			treeItem10.setText("Composite");
			treeItem10.setExpanded(true);

			treeItem12 = new TreeItem(treeItem10, SWT.NONE);
			treeItem12.setText("Canvas");

			treeItem11 = new TreeItem(treeItem10, SWT.NONE);
			treeItem11.setText("SashForm");

			composite9 = new Composite(composite7, SWT.NONE);
			GridLayout composite9Layout = new GridLayout();
			composite9Layout.marginWidth = 0;
			composite9Layout.marginHeight = 0;
			composite9Layout.numColumns = 2;
			composite9Layout.horizontalSpacing = 0;
			composite9Layout.verticalSpacing = 0;
			GridData composite9LData = new GridData();
			composite9LData.heightHint = 24;
			composite9LData.grabExcessHorizontalSpace = true;
			composite9LData.horizontalAlignment = GridData.FILL;
			composite9.setLayout(composite9Layout);
			composite9.layout();
			composite9.setLayoutData(composite9LData);

			tree3 = new Tree(composite7, SWT.NONE);
			GridData tree3LData = new GridData();
			tree3LData.grabExcessHorizontalSpace = true;
			tree3LData.grabExcessVerticalSpace = true;
			tree3LData.horizontalAlignment = GridData.FILL;
			tree3LData.verticalAlignment = GridData.FILL;
			tree3.setLayoutData(tree3LData);

			treeItem7 = new TreeItem(tree3, SWT.NONE);
			treeItem7.setText("testPackage");
			treeItem7.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/package_obj.gif"));
			treeItem7.setExpanded(true);

			treeItem8 = new TreeItem(treeItem7, SWT.NONE);
			treeItem8.setText("Class1");
			treeItem8.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/jcu_obj.gif"));

			treeItem9 = new TreeItem(treeItem7, SWT.NONE);
			treeItem9.setText("Class2");
			treeItem9.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/jcu_obj.gif"));

			cLabel4 = new CLabel(composite9, SWT.NONE);
			GridData cLabel4LData = new GridData();
			cLabel4LData.verticalAlignment = GridData.FILL;
			cLabel4LData.horizontalAlignment = GridData.FILL;
			cLabel4LData.grabExcessHorizontalSpace = true;
			cLabel4.setText("Package Explorer");
			cLabel4.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/package.gif"));
			cLabel4.setLayoutData(cLabel4LData);

			toolBar5 = new ToolBar(composite9, SWT.FLAT);
			GridData toolBar5LData = new GridData();
			toolBar5.setLayoutData(toolBar5LData);

			toolItem3 = new ToolItem(toolBar5, SWT.NONE);
			toolItem3.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/view_menu.gif"));

			toolItem4 = new ToolItem(toolBar5, SWT.NONE);
			toolItem4.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/close_view.gif"));

			coolBar1 = new CoolBar(composite1, SWT.NONE);

			coolItem3 = new CoolItem(coolBar1, SWT.DROP_DOWN);
			coolItem3.setPreferredSize(new org.eclipse.swt.graphics.Point(136,
					22));
			coolItem3
					.setMinimumSize(new org.eclipse.swt.graphics.Point(136, 22));
			coolItem3.setText("coolItem3");

			coolItem1 = new CoolItem(coolBar1, SWT.DROP_DOWN);
			coolItem1.setPreferredSize(new org.eclipse.swt.graphics.Point(72,
					22));
			coolItem1
					.setMinimumSize(new org.eclipse.swt.graphics.Point(72, 22));

			toolBar1 = new ToolBar(coolBar1, SWT.FLAT);
			coolItem1.setControl(toolBar1);

			toolBar2 = new ToolBar(coolBar1, SWT.FLAT);
			coolItem3.setControl(toolBar2);

			debugToolItem = new ToolItem(toolBar1, SWT.DROP_DOWN);
			debugToolItem.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/debug_exec.gif"));

			runToolItem = new ToolItem(toolBar1, SWT.DROP_DOWN);
			runToolItem.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/run_exec.gif"));
			runToolItem.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent evt) {
					runToolItemWidgetSelected(evt);
				}
			});

			debugToolItem.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent evt) {
					debugToolItemWidgetSelected(evt);
				}
			});

			newToolItem = new ToolItem(toolBar2, SWT.DROP_DOWN);
			SWTResourceManager.getImage("examples/swt/dummyeclipse/icons/new_wiz.gif").setBackground(
					SWTResourceManager.getColor(255, 255, 255));
			newToolItem.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/new_wiz.gif"));

			toolItem6 = new ToolItem(toolBar2, SWT.NONE);
			toolItem6.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/save_edit.gif"));

			toolItem5 = new ToolItem(toolBar2, SWT.NONE);
			toolItem5.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/saveas_edit.gif"));

			toolItem8 = new ToolItem(toolBar2, SWT.NONE);
			toolItem8.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/print_edit.gif"));

			separator3 = new ToolItem(toolBar2, SWT.SEPARATOR);

			toolItem13 = new ToolItem(toolBar2, SWT.NONE);
			toolItem13.setImage(SWTResourceManager
					.getImage("examples/swt/dummyeclipse/icons/build_exec.gif"));

			newToolItem.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent evt) {
					newToolItemWidgetSelected(evt);
				}
			});

			menu1 = new Menu(getShell(), SWT.BAR);

			getShell().setMenuBar(menu1);

			fileMenuItem = new MenuItem(menu1, SWT.CASCADE);
			fileMenuItem.setText("&File");

			editMenuItem = new MenuItem(menu1, SWT.CASCADE);
			editMenuItem.setText("&Edit");

			helpMenuItem = new MenuItem(menu1, SWT.CASCADE);
			helpMenuItem.setText("&Help");

			menu20 = new Menu(helpMenuItem);
			helpMenuItem.setMenu(menu20);

			helpContMenuItem = new MenuItem(menu20, SWT.PUSH);
			helpContMenuItem.setText("Help &Contents");

			menu15 = new Menu(editMenuItem);
			editMenuItem.setMenu(menu15);

			undoMenuItem = new MenuItem(menu15, SWT.PUSH);
			undoMenuItem.setText("Undo");

			redoMenuItem = new MenuItem(menu15, SWT.PUSH);
			redoMenuItem.setText("Redo");

			separator1 = new MenuItem(menu15, SWT.SEPARATOR);
			separator1.setText("menuItem27");

			cutMenuItem = new MenuItem(menu15, SWT.PUSH);
			cutMenuItem.setText("Cut");

			pasteMenuItem = new MenuItem(menu15, SWT.PUSH);
			pasteMenuItem.setText("Paste");

			copyMenuItem = new MenuItem(menu15, SWT.PUSH);
			copyMenuItem.setText("Copy");

			menu3 = new Menu(fileMenuItem);
			fileMenuItem.setMenu(menu3);

			newMenuItem = new MenuItem(menu3, SWT.CASCADE);
			newMenuItem.setText("&New");

			separator11 = new MenuItem(menu3, SWT.SEPARATOR);

			closeMenuItem = new MenuItem(menu3, SWT.PUSH);
			closeMenuItem.setText("&Close");

			saveMenuItem = new MenuItem(menu3, SWT.PUSH);
			saveMenuItem.setText("&Save");
			saveMenuItem
					.setImage(SWTResourceManager.getImage("examples/swt/dummyeclipse/icons/save.gif"));

			exitMenuItem = new MenuItem(menu3, SWT.PUSH);
			exitMenuItem.setText("&Exit");

			menu5 = new Menu(newMenuItem);
			newMenuItem.setMenu(menu5);

			projectItem = new MenuItem(menu5, SWT.PUSH);
			projectItem.setText("Project");

			menuItem5 = new MenuItem(menu5, SWT.SEPARATOR);

			packageItem = new MenuItem(menu5, SWT.PUSH);
			packageItem.setText("Package");

			this.layout();

			postInitGUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Auto-generated main method */
	public static void main(String[] args) {
		showGUI();
	}

	/**
	* Auto-generated method to display this 
	* %SUPERCLASS_NAME% inside a new Shell.
	*/
	public static void showGUI() {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		DummyEclipse inst = new DummyEclipse(shell, SWT.NULL);
		Point size = inst.getSize();
		shell.setLayout(new FillLayout());
		shell.layout();
		if(size.x == 0 && size.y == 0) {
			inst.pack();
			shell.pack();
		} else {
			Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
			shell.setSize(shellBounds.width, shellBounds.height);
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}

	/**
	 * Add your pre-init code in here
	 */
	public void preInitGUI() {
	}

	/**
	 * Add your post-init code in here
	 */
	public void postInitGUI() {
		Display display = cLabel7.getDisplay();
		cLabel7.setBackground(new Color[] {
				display.getSystemColor(SWT.COLOR_DARK_BLUE),
				display.getSystemColor(SWT.COLOR_BLUE), null }, new int[] { 50,
				100 });

	}

	/** Auto-generated event handler method */
	public void newToolItemWidgetSelected(SelectionEvent evt) {
		if (evt.detail == SWT.ARROW) {
			Menu menu = new Menu(getShell(), SWT.POP_UP);
			MenuItem mi = new MenuItem(menu, SWT.PUSH);
			mi.setText("New...");
			Rectangle b = newToolItem.getBounds();
			Point pt = new Point(b.x, b.y + b.height);
			pt = newToolItem.getParent().toDisplay(pt);
			menu.setLocation(pt.x, pt.y);
			menu.setVisible(true);
		}
	}

	/** Auto-generated event handler method */
	public void runToolItemWidgetSelected(SelectionEvent evt) {
		if (evt.detail == SWT.ARROW) {
			Menu menu = new Menu(getShell(), SWT.POP_UP);
			MenuItem mi = new MenuItem(menu, SWT.PUSH);
			mi.setText("Run...");
			Rectangle b = runToolItem.getBounds();
			Point pt = new Point(b.x, b.y + b.height);
			pt = runToolItem.getParent().toDisplay(pt);
			menu.setLocation(pt.x, pt.y);
			menu.setVisible(true);
		}
	}

	/** Auto-generated event handler method */
	public void debugToolItemWidgetSelected(SelectionEvent evt) {
		if (evt.detail == SWT.ARROW) {
			Menu menu = new Menu(getShell(), SWT.POP_UP);
			MenuItem mi = new MenuItem(menu, SWT.PUSH);
			mi.setText("Debug...");
			Rectangle b = debugToolItem.getBounds();
			Point pt = new Point(b.x, b.y + b.height);
			pt = debugToolItem.getParent().toDisplay(pt);
			menu.setLocation(pt.x, pt.y);
			menu.setVisible(true);
		}
	}
}
