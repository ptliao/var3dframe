package var3d.net.center.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Clipboard;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.I18NBundle;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.StringBuilder;
import com.sun.awt.AWTUtilities;

import org.lwjgl.opengl.Display;

import java.awt.AWTException;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.Event;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.GlyphVector;
import java.awt.font.TextAttribute;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import var3d.net.center.NativeTextField;
import var3d.net.center.VGame;
import var3d.net.center.VListener;
import var3d.net.center.VPayListener;
import var3d.net.center.VShopListener;
import var3d.net.center.VStage;
import var3d.net.center.VTextField;
import var3d.net.center.freefont.FreePaint;

import static com.badlogic.gdx.Input.Keys.B;
import static com.badlogic.gdx.Input.Keys.R;

public abstract class VDesktopLauncher implements VListener {
    private VGame game;
    public static final JFrame appFrame=new JFrame();

    public static void initialize(ApplicationListener listener, LwjglApplicationConfiguration config) {
        appFrame.setSize(config.width, config.height);
        appFrame.setLocationRelativeTo(null);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas=new Canvas();
        canvas.setSize(config.width, config.height);
        appFrame.add(canvas);
        appFrame.setVisible(true);
        LwjglApplication app=new LwjglApplication(listener,canvas);
    }

    public void setGame(VGame game) {
        this.game = game;
    }

    @Override
    public void esc() {
        Gdx.app.exit();
    }

    @Override
    public void getDiaolog(String msg) {
        // TODO Auto-generated method stub

    }

    @Override
    public void goToShare(String title, String context, String url,
                          byte[] imgByte, final Runnable success, final Runnable failure) {
        // TODO Auto-generated method stub

    }

    @Override
    public void sayGood() {
        // TODO Auto-generated method stub

    }

    @Override
    public void getTopList() {
        // TODO Auto-generated method stub

    }

    public void getTopList(String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void log(String txt) {
        // TODO Auto-generated method stub

    }

    @Override
    public void Tost(String msg) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getCountry() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void startLevel(String level) {
        // TODO Auto-generated method stub

    }

    @Override
    public void failLevel(String level) {
        // TODO Auto-generated method stub

    }

    @Override
    public void finishLevel(String level) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getAdDialog() {
        // TODO Auto-generated method stub

    }

    @Override
    public void openVar3dNet() {
        // TODO Auto-generated method stub

    }

    @Override
    public void openAd(String str) {
        // TODO Auto-generated method stub

    }

    public void openAd(String str, Object... objects){

    }

    public void openAd(int aglin) {
    }

    public void openAdbig(int aglin) {
    }

    @Override
    public void closeAd() {
        // TODO Auto-generated method stub

    }

    @Override
    public void openFullAd() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onIOSResume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onIOSPause() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getDeviceId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void signUp(String name, String pass) {
        // TODO Auto-generated method stub
    }

    public Array<Object> signUp(Object... obj) {
        return null;
    }

    @Override
    public Locale getLocale() {
        // TODO Auto-generated method stub
        return Locale.getDefault();
    }

    @Override
    public void openAppShop(String url) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updataScore(String userId, int score) {
        // TODO Auto-generated method stub

    }

    @Override
    public void universalMethod(Object... obj) {
        // TODO Auto-generated method stub

    }

    public Array<Object> intelligentMethod(Object... obj) {
        return null;
    }

    @Override
    public void pay(double price, String name, VPayListener listen) {

    }

    public void getBuyList(VShopListener listen) {
    }

    @Override
    public boolean isCanShow() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void openActivity(Class<?> cls, String name, Object value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void openActivity(Class<?> cls, String[] name, Object[] value) {
        // TODO Auto-generated method stub

    }

    public Pixmap getFontPixmap(String txt, FreePaint vpaint) {
        Font font = getFont(vpaint);
        FontMetrics fm = metrics.get(vpaint.getName());
        int strWidth = fm.stringWidth(txt);
        int strHeight = fm.getAscent() + fm.getDescent();
        if (strWidth == 0) {
            strWidth = strHeight = vpaint.getTextSize();
        }
        BufferedImage bi = new BufferedImage(strWidth, strHeight,
                BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setFont(font);
        if (vpaint.getStrokeColor() != null) {
            // 描边
            GlyphVector v = font.createGlyphVector(fm.getFontRenderContext(),
                    txt);
            Shape shape = v.getOutline();
            g.setColor(getColor(vpaint.getColor()));
            g.translate(0, fm.getAscent());
            g.fill(shape);
            g.setStroke(new BasicStroke(vpaint.getStrokeWidth()));
            g.setColor(getColor(vpaint.getStrokeColor()));
            g.draw(shape);
        } else if (vpaint.getUnderlineText() == true) {
            // 下划线
            AttributedString as = new AttributedString(txt);
            as.addAttribute(TextAttribute.FONT, font);
            as.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            g.setColor(getColor(vpaint.getColor()));
            g.drawString(as.getIterator(), 0, fm.getAscent());
        } else if (vpaint.getStrikeThruText() == true) {
            // 删除线
            AttributedString as = new AttributedString(txt);
            as.addAttribute(TextAttribute.FONT, font);
            as.addAttribute(TextAttribute.STRIKETHROUGH,
                    TextAttribute.STRIKETHROUGH_ON);
            g.setColor(getColor(vpaint.getColor()));
            g.drawString(as.getIterator(), 0, fm.getAscent());
        } else {
            // 普通
            g.setColor(getColor(vpaint.getColor()));
            g.drawString(txt, 0, fm.getAscent());
        }
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            ImageIO.write(bi, "png", buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pixmap pixmap = new Pixmap(buffer.toByteArray(), 0,
                buffer.toByteArray().length);
        return pixmap;
    }

    private HashMap<String, Font> fonts = new HashMap<String, Font>();
    private HashMap<String, FontMetrics> metrics = new HashMap<String, FontMetrics>();

    private Font getFont(FreePaint vpaint) {
        boolean isBolo = vpaint.getFakeBoldText()
                || vpaint.getStrokeColor() != null;
        Font font = fonts.get(vpaint.getName());
        if (font == null) {
            if (vpaint.getTTFName().equals("")) {
                font = new Font(null, isBolo ? Font.BOLD : Font.PLAIN,
                        vpaint.getTextSize());
            } else {
                try {
                    ByteArrayInputStream in = new ByteArrayInputStream(
                            Gdx.files.internal(
                                    vpaint.getTTFName()
                                            + (vpaint.getTTFName().endsWith(
                                            ".ttf") ? "" : ".ttf"))
                                    .readBytes());
                    BufferedInputStream fb = new BufferedInputStream(in);
                    font = Font.createFont(Font.TRUETYPE_FONT, fb).deriveFont(
                            Font.BOLD, vpaint.getTextSize());
                    fb.close();
                    in.close();
                } catch (FontFormatException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            fonts.put(vpaint.getName(), font);
            BufferedImage bi = new BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR);
            Graphics2D g = bi.createGraphics();
            g.setFont(font);
            FontMetrics fm = g.getFontMetrics();
            metrics.put(vpaint.getName(), fm);
        }
        return font;
    }

    private java.awt.Color getColor(Color libColor) {
        return new java.awt.Color(libColor.r, libColor.g, libColor.b, libColor.a);
    }

    public void runOnUiThread(Runnable run) {
        run.run();
    }

    public void Screenshot(VGame game) {
    }

    @Override
    public void createIcon(VGame game, String path) {
    }

    @Override
    public void editLanguage(VGame game, String path) {
    }

    @Override
    public void createScreenshot(VGame game, String path) {
    }

    public void editScreenshot(VGame game, String path) {
    }

    private I18NBundle bundle = null;
    private String prefLanguage="auto";

    public String getString(String key) {
        String language = game.getLanguage();
        if(language==null)language="auto";
        String out = null;
        if (bundle == null || !language.equals(prefLanguage)) {
            try {
                FileHandle baseFileHandle = Gdx.files.internal("values/strings");
                if (language.equals("auto")) {
                    bundle = I18NBundle.createBundle(baseFileHandle, Locale.getDefault());
                } else {
                    bundle = I18NBundle.createBundle(baseFileHandle, new Locale(language));
                }
                out = bundle.get(key);
            } catch (NullPointerException e) {
            }
        } else {
            try {
                out = bundle.get(key);
            } catch (NullPointerException e) {
            }
        }
        prefLanguage = language;
        return out == null ? key : out;
    }

    public String getVersionName() {
        return "1.0";
    }

    public void openProtect(String... names) {
        Protect(false, names);
    }

    public void unProtect(String... names) {
        Protect(true, names);
    }

    private void Protect(boolean isReProtect, String... names) {
        for (String name : names) {
            String proName = Gdx.files.getLocalStoragePath() + name;// 文件夹名
            FileHandle hand = Gdx.files.absolute(proName);
            if (!hand.isDirectory())
                continue;// 如果不是文件夹就跳过
            FileHandle[] files = hand.list();
            for (FileHandle file : files) {
                if (file.name().startsWith("."))
                    continue;
                try {
                    if (isReProtect) {
                        jem(file.file());
                    } else {
                        jam(file.file());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private byte[] defByte = new byte[2];

    @SuppressWarnings("resource")
    private void jem(File load) throws Exception {
        FileInputStream fis = new FileInputStream(load);
        fis.read(defByte, 0, 2);
        String str_head = game.bytesToHexString(defByte);
        if (str_head.equals("8950") || str_head.equals("ffd8")) {
            // 如果是图片,就跳过
            return;
        }
        File defFile = new File(load.getPath() + "_var3d_def");
        FileOutputStream fos = new FileOutputStream(defFile);
        int XOR_CONST = defByte[0] & 0xFF;
        fos.write(defByte[1] ^ XOR_CONST);
        int read;
        while ((read = fis.read()) > -1) {
            fos.write(read ^ XOR_CONST);
        }
        fos.flush();
        fos.close();
        fis.close();
        load.delete();
        defFile.renameTo(load);
        Display.setTitle(load.getName() + "解密完成");
    }

    @SuppressWarnings("resource")
    private void jam(File load) throws Exception {
        int XOR_CONST = MathUtils.random(0xFF);
        FileInputStream fis = new FileInputStream(load);
        fis.read(defByte, 0, 2);
        String str_head = game.bytesToHexString(defByte);
        if (!str_head.equals("8950") && !str_head.equals("ffd8")) {
            // 如果不是图片,就跳过
            return;
        }
        File defFile = new File(load.getPath() + "_var3d_def");
        FileOutputStream fos = new FileOutputStream(defFile);
        fos.write(XOR_CONST);
        for (byte b : defByte) {
            fos.write(b ^ XOR_CONST);
        }
        int read;
        while ((read = fis.read()) > -1) {
            fos.write(read ^ XOR_CONST);
        }
        fos.flush();
        fos.close();
        fis.close();
        load.delete();
        defFile.renameTo(load);
        Display.setTitle(load.getName() + "加密完成");
    }

    public static LwjglApplicationConfiguration getConfig(int width, int height, float scale) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = (int) (width * scale);
        config.height = (int) (height * scale);
        config.samples = 4;
        return config;
    }

    public static LwjglApplicationConfiguration getConfig(int width, int height) {
        return getConfig(width, height, 1);
    }

    public enum Size {
        iphone_h, ipad_h, iphone_w, ipad_w, iphoneX_w, iphoneX_h;
    }

    static int width = 0, height = 0;

    public static LwjglApplicationConfiguration getConfig(Size size, float bl) {
        switch (size) {
            case iphone_h:
                width = 1242;
                height = 2208;
                break;
            case ipad_h:
                width = 2048;
                height = 2732;
                break;
            case iphoneX_w:
                height = 1125;
                width = 2436;
                break;
            case iphone_w:
                height = 1242;
                width = 2208;
                break;
            case ipad_w:
                height = 2048;
                width = 2732;
                break;
            case iphoneX_h:
                height = 2436;
                width = 1125;
                break;
        }
        return getConfig(width, height, bl);
    }

    public static LwjglApplicationConfiguration getConfig(Size size) {
        //获取电脑屏幕分辨率(日了狗了mac能通过测试但是windows会报错，只好弃用了)
        int screenWidth = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width * .9f);
        int screenHeight = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height * .9f);
        float bl = 1;
        switch (size) {
            case iphone_h:
                width = 1242;
                height = 2208;
                float blw = screenWidth / (float) width;
                bl = screenHeight / (float) height;
                if (blw < bl) bl = blw;
                break;
            case ipad_h:
                width = 2048;
                height = 2732;
                blw = screenWidth / (float) width;
                bl = screenHeight / (float) height;
                if (blw < bl) bl = blw;
                break;
            case iphoneX_w:
                height = 1125;
                width = 2436;
                blw = screenWidth / (float) width;
                bl = screenHeight / (float) height;
                if (blw < bl) bl = blw;
                break;
            case iphone_w:
                height = 1242;
                width = 2208;
                blw = screenWidth / (float) width;
                bl = screenHeight / (float) height;
                if (blw < bl) bl = blw;
                break;
            case ipad_w:
                height = 2048;
                width = 2732;
                blw = screenWidth / (float) width;
                bl = screenHeight / (float) height;
                if (blw < bl) bl = blw;
                break;
            case iphoneX_h:
                height = 2436;
                width = 1125;
                blw = screenWidth / (float) width;
                bl = screenHeight / (float) height;
                if (blw < bl) bl = blw;
                break;
        }
        return getConfig(width, height, bl);
    }

    public Vector2 getAppScreenSize() {
        return new Vector2(width, height);
    }

    public void create() {
    }

    //以下是简易UI编辑器

    private boolean isEdit = false;
    private HashMap<Actor, Data> allDatas = new HashMap<Actor, Data>();
    //private ToolFrame toolFrame;

    public class Data {
        public HashMap<Actor, Data> sonDatas = new HashMap<Actor, Data>();//用来保存儿子们的属性
        public Array<EventListener> allListeners;//该Actor本来的监听
        public boolean isEdit = false;//是否被编辑
        public Field filed;//保存对应的对象
        public Touchable prefTouchable;//最初的Actor响应属性
        public int variableType = 1;//成员变量1，局部变量2，匿名变量0, 暂不可保存变量-1
        public String name = null;//变量名
    }

    private String getPrefName() {
        Data data = allDatas.get(prefActor);
        if (data == null) return "匿名控件";
        if (data.variableType == -1) {
            return "匿名控件";
        } else if (data.variableType == 1) {
            return data.name + "控件";
        } else if (data.variableType == 2) {
            return data.name + "控件";
        } else {
            return "匿名控件";
        }
    }

    private IntArray keys = new IntArray();

    public void keyDown(int key) {
        keys.add(key);
        if (nowActor == null) return;
        if (keys.size == 1) {
            //单按钮
            switch (key) {
                case Input.Keys.LEFT://左移
                    moveByActor(-1, 0);
                    break;
                case Input.Keys.RIGHT://右移
                    moveByActor(1, 0);
                    break;
                case Input.Keys.UP://上移
                    moveByActor(0, 1);
                    break;
                case Input.Keys.DOWN://下移
                    moveByActor(0, -1);
                    break;
            }
        } else if (keys.size == 2) {
            //双按钮组合
            int fistKey = keys.get(0);
            if (fistKey == Input.Keys.SHIFT_RIGHT) fistKey = Input.Keys.SHIFT_LEFT;
            if (7 < fistKey && fistKey < 11) {
                int speed = fistKey == 8 ? 10 : fistKey == 9 ? 50 : 100;
                switch (key) {
                    case Input.Keys.LEFT://左移
                        moveByActor(-speed, 0);
                        break;
                    case Input.Keys.RIGHT://右移
                        moveByActor(speed, 0);
                        break;
                    case Input.Keys.UP://上移
                        moveByActor(0, speed);
                        break;
                    case Input.Keys.DOWN://下移
                        moveByActor(0, -speed);
                        break;
                }
            } else {
                switch (fistKey) {
                    case Input.Keys.SHIFT_LEFT:
                        switch (keys.get(1)) {
                            case Input.Keys.C: //居中对齐
                                if (prefActor != null) {
                                    messeg = "相对" + getPrefName() + "居中对齐";
                                    moveActor(prefActor.getX(Align.center), prefActor.getY(Align.center), Align.center);
                                }
                                break;
                            case Input.Keys.LEFT://居左对齐
                                if (prefActor != null) {
                                    messeg = "相对" + getPrefName() + "居左对齐";
                                    moveActor(prefActor.getX(), nowActor.getY(), Align.bottomLeft);
                                }
                                break;
                            case Input.Keys.RIGHT://居右对齐
                                if (prefActor != null) {
                                    messeg = "相对" + getPrefName() + "居右对齐";
                                    moveActor(prefActor.getRight(), nowActor.getY(), Align.bottomRight);
                                }
                                break;
                            case Input.Keys.UP://居上对齐
                                if (prefActor != null) {
                                    messeg = "相对" + getPrefName() + "居上对齐";
                                    moveActor(nowActor.getX(), prefActor.getTop(), Align.topLeft);
                                }
                                break;
                            case Input.Keys.DOWN://居下对齐
                                if (prefActor != null) {
                                    messeg = "相对" + getPrefName() + "居下对齐";
                                    moveActor(nowActor.getX(), prefActor.getY(), Align.bottomLeft);
                                }
                                break;
                        }
                        break;
                    case Input.Keys.TAB:
                        Stage father = nowActor.getStage();
                        switch (key) {
                            case Input.Keys.C: //actor相对于父元素居中
                                messeg = "相对父元素居中对齐";
                                moveActor(father.getWidth() / 2, father.getHeight() / 2, Align.center);
                                break;
                            case Input.Keys.LEFT://。。。。居左
                                messeg = "相对父元素居左对齐";
                                moveActor(0, nowActor.getY(), Align.bottomLeft);
                                break;
                            case Input.Keys.RIGHT://....居右
                                messeg = "相对父元素居右对齐";
                                moveActor(father.getWidth(), nowActor.getY(), Align.bottomRight);
                                break;
                            case Input.Keys.UP://。。。。居上
                                messeg = "相对父元素居上对齐";
                                moveActor(nowActor.getX(), father.getHeight(), Align.topLeft);
                                break;
                            case Input.Keys.DOWN://....居下
                                messeg = "相对父元素居下对齐";
                                moveActor(nowActor.getX(), 0, Align.bottomLeft);
                                break;
                        }
                        break;
                    case Input.Keys.ALT_LEFT:
                        break;
                }
            }
        } else if (keys.size == 3) {
            //三按钮组合
            int fistKey = keys.get(0);
            if (fistKey == Input.Keys.SHIFT_RIGHT) fistKey = Input.Keys.SHIFT_LEFT;
            switch (fistKey) {
                case Input.Keys.SHIFT_LEFT:
                    if ((keys.get(1) == Input.Keys.LEFT && keys.get(2) == Input.Keys.RIGHT)
                            || (keys.get(1) == Input.Keys.RIGHT && keys.get(2) == Input.Keys.LEFT)) {
                        //同时按下左右键，x居中对齐
                        if (prefActor != null) {
                            messeg = "相对" + getPrefName() + "水平居中对齐";
                            moveActor(prefActor.getX(Align.center), nowActor.getY(), Align.bottom);
                        }
                    } else if ((keys.get(1) == Input.Keys.UP && keys.get(2) == Input.Keys.DOWN)
                            || (keys.get(1) == Input.Keys.DOWN && keys.get(2) == Input.Keys.UP)) {
                        //同时按下上下键，y居中对齐
                        if (prefActor != null) {
                            messeg = "相对" + getPrefName() + "垂直居中对齐";
                            moveActor(nowActor.getX(), prefActor.getY(Align.center), Align.left);
                        }
                    }
                    break;
            }
        }
    }

    public void keyUp(int key) {
        keys.removeValue(key);
    }

    private void moveByActor(float x, float y) {
        if (nowActor == null) return;
        nowActor.moveBy(x, y);
        String fx = x < 0 ? "左" : x > 0 ? "右" : y < 0 ? "下" : "上";
        int speed = (int) Math.abs(x) + (int) Math.abs(y);
        messeg = fx + "移" + speed + "像素";
        msg(nowActor, allDatas.get(nowActor), "X:" + (int) nowActor.getX() + ",Y:" + (int) nowActor.getY());
    }

    private void moveActor(float x, float y, int align) {
        if (nowActor == null) return;
        nowActor.setPosition(x, y, align);
        msg(nowActor, allDatas.get(nowActor), "X:" + (int) nowActor.getX() + ",Y:" + (int) nowActor.getY());
    }

    private Actor prefActor, nowActor;//当前编辑的Actor

    public void edit(VStage stage) {
        if (isEdit) {
            isEdit = false;
            Display.setTitle("UI编辑关闭");
            for (final Actor actor : stage.getRoot().getChildren()) {
                Data data = allDatas.get(actor);
                actor.setDebug(false);
                actor.setTouchable(data.prefTouchable);
                if (actor instanceof Group) {
                    //如果是Group，那就需要想办法把儿子们禁止响应了
                    Group group = (Group) actor;
                    for (Actor son : group.getChildren()) {
                        Data sonData = data.sonDatas.get(son);
                        son.setTouchable(sonData.prefTouchable);
                    }
                }
                actor.clearListeners();
                if (data.allListeners != null) {
                    for (EventListener listener : data.allListeners) {
                        actor.addListener(listener);
                    }
                }
            }
            allDatas.clear();
        } else {
            isEdit = true;
            Display.setTitle("UI编辑开启");
            //new SubFrame();
            //用反射取得该Actor的变量名
            Class clazz = stage.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (final Actor actor : stage.getRoot().getChildren()) {
                final Data data = new Data();
                for (Field field : fields) {
                    field.setAccessible(true);
                    try {
                        Object object = field.get(stage);
                        if (!(object instanceof Actor)) {
                            continue;
                        } else if (actor == object) {
                            data.filed = field;
                            data.variableType = 1;
                            data.name = data.filed.getName();
                            break;
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                data.prefTouchable = actor.getTouchable();
                //actor.setDebug(true);
                actor.setTouchable(Touchable.enabled);
                data.allListeners = actor.getListeners();
                if (actor instanceof Group) {
                    //如果是Group，那就需要想办法把儿子们禁止响应了
                    Group group = (Group) actor;
                    for (Actor son : group.getChildren()) {
                        Data sonData = new Data();
                        sonData.prefTouchable = son.getTouchable();
                        data.sonDatas.put(son, sonData);
                        son.setTouchable(Touchable.disabled);
                    }
                }
                allDatas.put(actor, data);
                if (data.filed == null) {
                    //说明是匿名变量或者局部变量，直接抓源码分析
                    String name = getPartialVariable(stage, actor);
                    if (name == null) {
                        data.variableType = -1;
                    } else if (name.equals("?")) {
                        data.variableType = 0;
                    } else {
                        data.variableType = 2;
                        data.name = name;
                    }
                }
                actor.clearListeners();
                actor.addListener(new InputListener() {
                    private float starX, starY;

                    public boolean touchDown(InputEvent event, float px, float py, int pointer, int but) {
                        if (nowActor != actor) {
                            messeg = "选取";
                            if (prefActor != null) prefActor.setDebug(false);
                            prefActor = nowActor;
                            if (prefActor != null) prefActor.setDebug(true);
                            nowActor = actor;
                            nowActor.setDebug(true);
                        }
                        starX = px;
                        starY = py;
                        String xy;
                        xy = "X:" + (int) actor.getX() + ",Y:" + (int) actor.getY();
                        msg(actor, data, xy);
                        return true;
                    }

                    public void touchDragged(InputEvent event, float x, float y, int pointer) {
                        if (keys.size == 0) {
                            messeg = "拖动";
                            actor.moveBy(x - starX, y - starY);
                        } else if (keys.size == 1) {
                            int key = keys.get(0);
                            if (key == Input.Keys.X) {
                                messeg = "垂直锁定";
                                actor.moveBy(x - starX, 0);
                            } else if (key == Input.Keys.Y) {
                                messeg = "水平锁定";
                                actor.moveBy(0, y - starY);
                            }
                        }
                        data.isEdit = true;
                        msg(actor, data, "X:" + (int) actor.getX() + ",Y:" + (int) actor.getY());
                    }

                    public void touchUp(InputEvent event, float px, float py,
                                        int pointer, int but) {
                        Clipboard clip = Gdx.app.getClipboard();
                        clip.setContents(".setPosition(" + (int) actor.getX() + "," + (int) actor.getY() + ")");
                    }
                });
            }
        }
    }


    private String messeg = "";//操作消息

    private void msg(Actor actor, Data data, String xy) {
        String name, type = "";
        if (data.variableType == -1) {
            name = "无法保存的Actor";
        } else if (data.variableType == 1) {
            type = "成员变量";
            name = data.name;
        } else if (data.variableType == 2) {
            type = "局部变量";
            name = data.name;
        } else {
            type = "匿名变量";
            name = "";
        }
        Display.setTitle(type + ":" + name + " 类型:" + actor.getClass().getSimpleName()
                + " 坐标:" + xy + " 消息:" + messeg);
    }

    private class SubFrame extends JFrame {
        public SubFrame() {
            setTitle("子窗口");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationByPlatform(true);
            setVisible(true);
        }

    }


    //用来获取actor的局部变量名，除非为匿名变量
    private String getPartialVariable(VStage stage, Actor actor) {
        FileHandle fileHandle = getStageJavaFile(stage);
        if (fileHandle == null) fileHandle = getStageKotlinFile(stage);
        if (fileHandle == null) return null;
        String javaStr = fileHandle.readString();
        String[] javaStrLines = javaStr.split("\n");//把代码按行号存放进数组中
        Data data = allDatas.get(actor);
        StackTraceElement[] elements = allStacks.get(actor);
        if (elements == null) return null;//为null表示这是非UI类创建的控件，以后再实现非UI类创建的控件
        String str_class = elements[2].getClassName();//变量所在的类全名
        if (str_class.equals(stage.getClass().getName())) {//如果所在的类就是传入的这个Stage
            int linNumber = elements[2].getLineNumber();//获取该变量调用初始化所在的行号
            Array<String> javaStrArr = new Array<>();
            int partNumber = 0;
            for (int i = linNumber - 1; i > 1; i--) {
                String javaStrLine = javaStrLines[i].trim();
                javaStrLine = javaStrLine.replaceAll(" +", " ");
                javaStrLine = javaStrLine.replaceAll(" \\.", ".");
                javaStrLine = javaStrLine.replaceAll("\\. ", ".");
                javaStrLine = javaStrLine.replaceAll(" ", "㜶");
                //移除注释
                String noAnnotations = javaStrLine.replaceAll(
                        "\\/\\/[^\\n]*|\\/\\*([^\\*^\\/]*|[\\*^\\/*]*|[^\\**\\/]*)*\\*+\\/", "");
                if (noAnnotations.indexOf(";") != -1 || fileType == FileType.Kotlin) {
                    partNumber++;
                    if (partNumber == 2) {
                        int i1 = noAnnotations.lastIndexOf(";");
                        if (i1 == -1 && fileType == FileType.Kotlin)
                            i1 = noAnnotations.length() - 1;
                        javaStrArr.add(noAnnotations.substring(i1 + 1));
                        //javaStrLines[i] = noAnnotations.substring(0, i1);
                        break;
                    } else {
                        javaStrArr.add(noAnnotations);
                    }
                } else {
                    javaStrArr.add(noAnnotations);
                    //javaStrLines[i] = "";
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = javaStrArr.size - 1; i > -1; i--) {
                String strLine = javaStrArr.get(i);
                stringBuilder.append("㜶");
                stringBuilder.append(strLine);
            }
            String codeStr = stringBuilder.toString();
            int idex;
            if ((idex = codeStr.indexOf("=")) != -1) {
                String name = codeStr.substring(0, idex).replaceAll("㜶", " ").trim();
                name = name.replaceAll(" +", " ");
                idex = name.lastIndexOf(" ");
                if (idex != -1) {
                    name = name.substring(name.lastIndexOf(" "));
                }
                return name.trim();
            } else {
                return "?";//匿名变量
            }
        }


        return null;
    }

    //保存编辑过的Actor
    public void saveUI(VStage stage) {
        //遍历stage中的actor，并找出该actor在stage初始化时的行号位置
        FileHandle fileHandle = getStageJavaFile(stage);
        if (fileHandle == null) fileHandle = getStageKotlinFile(stage);
        if (fileHandle == null) return;
        String javaStr = fileHandle.readString();
        String[] javaStrLines = javaStr.split("\n");//把代码按行号存放进数组中
        for (final Actor actor : stage.getRoot().getChildren()) {
            Data data = allDatas.get(actor);
            if (data == null) return;
            if (data.isEdit) {
                StackTraceElement[] elements = allStacks.get(actor);
                if (elements == null) continue;
                String str_class = elements[2].getClassName();
                if (str_class.equals(stage.getClass().getName())) {
                    int linNumber = elements[2].getLineNumber();
                    int firstLinNumber = linNumber;
                    Array<String> javaStrArr = new Array<>();
                    int partNumber = 0;
                    for (int i = linNumber - 1; i > 1; i--) {
                        String javaStrLine = javaStrLines[i].trim();
                        javaStrLine = javaStrLine.replaceAll(" +", " ");
                        javaStrLine = javaStrLine.replaceAll(" \\.", ".");
                        javaStrLine = javaStrLine.replaceAll("\\. ", ".");
                        javaStrLine = javaStrLine.replaceAll(" ", "㜶");
                        //移除注释
                        String noAnnotations = javaStrLine.replaceAll(
                                "\\/\\/[^\\n]*|\\/\\*([^\\*^\\/]*|[\\*^\\/*]*|[^\\**\\/]*)*\\*+\\/", "");
                        if (noAnnotations.indexOf(";") != -1 || fileType == FileType.Kotlin) {
                            partNumber++;
                            if (partNumber == 2) {
                                int i1 = noAnnotations.lastIndexOf(";");
                                if (i1 == -1 && fileType == FileType.Kotlin)
                                    i1 = noAnnotations.length() - 1;
                                javaStrArr.add(noAnnotations.substring(i1 + 1));
                                break;
                            } else {
                                javaStrArr.add(noAnnotations);
                                javaStrLines[i] = "";
                            }
                        } else {
                            javaStrArr.add(noAnnotations);
                            javaStrLines[i] = "";
                        }
                    }
                    firstLinNumber -= javaStrArr.size - 1;
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int len = javaStrArr.size - 1, i = len; i > -1; i--) {
                        String strLine = javaStrArr.get(i).trim();
                        stringBuilder.append("㜶");
                        stringBuilder.append(strLine);
                    }
                    String codeStr = stringBuilder.toString().replaceAll("㜶+", "㜶");
                    if (codeStr.startsWith("㜶")) {
                        codeStr = codeStr.substring(1);
                    }
                    // Gdx.app.log("aaaaaa", codeStr);
                    String floatNumberSuffix = "";
                    if (fileType == FileType.Kotlin)
                        floatNumberSuffix = "f";
                    int idex;
                    if ((idex = codeStr.lastIndexOf("setPosition(")) != -1) {
                        //说明拥有setPosition方法
                        String s1 = codeStr.substring(idex);
                        s1 = s1.substring(0, s1.indexOf(")") + 1);
                        codeStr = codeStr.replace(s1, "setPosition(" + (int) actor.getX() + floatNumberSuffix + "," + (int) actor.getY() + floatNumberSuffix + ")");
                    } else {
                        //如果没有setPosition方法,那么去定位show,getActor()
                        idex = codeStr.lastIndexOf(".show(");
                        if (idex == -1) idex = codeStr.lastIndexOf(".getActor(");
                        //接着把字符分为两段
                        String s1 = codeStr.substring(0, idex);
                        String s2 = codeStr.substring(idex);
                        codeStr = s1 + ".setPosition(" + (int) actor.getX() + floatNumberSuffix + "," + (int) actor.getY() + floatNumberSuffix + ")" + s2;
                    }
                    List<String> listStr = new ArrayList<String>();
                    String subStr, prefStr = "";
                    int prefIndex = 0, width = 90;
                    for (int i = 0; ; i++) {
                        int index = codeStr.indexOf(".", i);
                        if (index == -1) {
                            listStr.add(prefStr + codeStr.substring(prefIndex));
                            break;
                        }
                        subStr = codeStr.substring(prefIndex, index);
                        if (prefStr.length() + subStr.length() > width) {
                            listStr.add(prefStr);
                            prefIndex = index;
                            prefStr = subStr;
                        } else {
                            prefStr += subStr;
                            prefIndex = index;
                        }
                    }
                    StringBuilder out = new StringBuilder();
                    for (int i = 0; i < listStr.size(); i++) {
                        out.append("        ");
                        // Gdx.app.log("bbbbbb", listStr.get(i));
                        String sline = listStr.get(i).replaceAll("㜶", " ");
                        //Gdx.app.log("cccccc", sline);
                        sline = sline.replaceAll(" \\.", ".");
                        sline = sline.replaceAll("\\. ", ".");
                        out.append(sline);
                        if (i < listStr.size() - 1) out.append("\n");
                    }
                    javaStrLines[firstLinNumber] = out.toString();
                    // Gdx.app.log("bbbbbb", out.toString());
                }
            }
        }
        //重新组装java代码
        StringBuilder out = new StringBuilder();
        boolean prefLineIsNull = false;
        for (int i = 0; i < javaStrLines.length; i++) {
            String thisline = javaStrLines[i];
            boolean nowNull = thisline.replaceAll(" ", "").length() == 0;
            if (prefLineIsNull && nowNull) {
                prefLineIsNull = nowNull;
                continue;
            } else {
                prefLineIsNull = nowNull;
            }
            out.append(javaStrLines[i]);
            out.append("\n");
        }
        //保存java代码
        fileHandle.writeString(out.toString(), false);
        //关闭窗口
        Gdx.app.exit();
    }

    //读取Stage java文件
    private HashMap<VStage, FileHandle> stageFiles = new HashMap<VStage, FileHandle>();

    private FileType fileType;

    enum FileType {Java, Kotlin}

    private FileHandle getStageJavaFile(VStage stage) {
        if (stageFiles.get(stage) != null) return stageFiles.get(stage);
        String proName = Gdx.files.getLocalStoragePath().replaceAll("\\/android\\/assets\\/", "");
        String pack = stage.getClass().getPackage().toString().replaceAll("package ", "");
        pack = pack.replaceAll("\\.", "/");
        String tryPath = proName + "/core/src/" + pack + "/" + stage.getClass().getSimpleName() + ".java";
        FileHandle fileHandle = Gdx.files.absolute(tryPath);
        if (!fileHandle.exists()) {
            //如果不存在，则找另一个路径
            tryPath = proName + "/core/src/main/java/" + pack + "/" + stage.getClass().getSimpleName() + ".java";
            fileHandle = Gdx.files.absolute(tryPath);
        }
        if (!fileHandle.exists()) return null;
        stageFiles.put(stage, fileHandle);
        fileType = FileType.Java;
        return fileHandle;
    }

    private FileHandle getStageKotlinFile(VStage stage) {
        if (stageFiles.get(stage) != null) return stageFiles.get(stage);
        String proName = Gdx.files.getLocalStoragePath().replaceAll("\\/android\\/assets\\/", "");
        String pack = stage.getClass().getPackage().toString().replaceAll("package ", "");
        pack = pack.replaceAll("\\.", "/");
        String tryPath = proName + "/core/src/" + pack + "/" + stage.getClass().getSimpleName() + ".kt";
        FileHandle fileHandle = Gdx.files.absolute(tryPath);
        if (!fileHandle.exists()) {
            //如果不存在，则找另一个路径
            tryPath = proName + "/core/src/main/java/" + pack + "/" + stage.getClass().getSimpleName() + ".kt";
            fileHandle = Gdx.files.absolute(tryPath);
        }
        if (!fileHandle.exists()) return null;
        stageFiles.put(stage, fileHandle);
        fileType = FileType.Kotlin;
        return fileHandle;
    }


    //获取行号接口实现
    private HashMap<Actor, StackTraceElement[]> allStacks = new HashMap<>();

    public void getLineNumber(Actor actor) {
        if (allStacks.get(actor) != null) return;
        StackTraceElement[] elements = new Throwable().getStackTrace();
        allStacks.put(actor, elements);
    }

    //返回安全区域(landLeft[132.0,63.0,132.0,0.0]/port[0.0,102.0,0.0,132.0])
    private Rectangle rectangle = new Rectangle();

    public Rectangle getSafeAreaInsets() {
        if ((width == 1125 && height == 2436) || (width == 2436 && height == 1125)) {
            if (Gdx.graphics.getWidth() < Gdx.graphics.getHeight()) {
                rectangle.set(0, 102, 0, 132);
            } else {
                rectangle.set(132, 63, 132, 0);
            }
        }
        return rectangle;
    }

    public Pixmap getIphoneXPixmap(String name) {
        String[] str_angles = Defeat.getStr_angles();
        Pixmap outPixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);
        int angleSize = (int) Math.sqrt(str_angles.length);
        drawAngle(outPixmap, str_angles, angleSize, 0, 0, false, false);
        drawAngle(outPixmap, str_angles, angleSize, width - angleSize, 0, true, false);
        drawAngle(outPixmap, str_angles, angleSize, 0, height - angleSize, false, true);
        drawAngle(outPixmap, str_angles, angleSize, width - angleSize, height - angleSize, true, true);
        String[] str_titles = Defeat.getStr_titles();
        if (width > height) {
            drawTitle(outPixmap, str_titles, 83, 642, 0, height / 2 - 321, false, false, false);
            String[] str_homes = Defeat.getStr_homews();
            drawHome(outPixmap, str_homes, 628, 39, width / 2 - 314, height - 39, false, false);
        } else {
            drawTitle(outPixmap, str_titles, 83, 642, width / 2 - 321, 0, false, true, true);
            String[] str_homes = Defeat.getStr_homehs();
            drawHome(outPixmap, str_homes, 398, 45, width / 2 - 199, height - 45, false, false);
        }
        return outPixmap;
    }

    private void drawHome(Pixmap outPixmap, String[] str_homes, int homeWidth, int homeHeight, int px, int py, boolean isFlipX, boolean isFlipY) {
        for (int x = 0; x < homeWidth; x++) {
            int xx = isFlipX ? homeWidth - 1 - x : x;
            for (int y = 0; y < homeHeight; y++) {
                int yy = isFlipY ? homeHeight - 1 - y : y;
                int color = Integer.parseInt(str_homes[xx * homeHeight + yy]);
                outPixmap.drawPixel(x + px, y + py, color);
            }
        }
    }

    private void drawAngle(Pixmap outPixmap, String[] str_angles, int angleSize, int px, int py, boolean isFlipX, boolean isFlipY) {
        for (int x = 0; x < angleSize; x++) {
            int xx = isFlipX ? angleSize - 1 - x : x;
            for (int y = 0; y < angleSize; y++) {
                int yy = isFlipY ? angleSize - 1 - y : y;
                int color = Integer.parseInt(str_angles[yy * angleSize + xx]);
                outPixmap.drawPixel(x + px, y + py, color);
            }
        }
    }

    private void drawTitle(Pixmap outPixmap, String[] str_titles, int titleWidth, int titleHeight
            , int px, int py, boolean isFlipX, boolean isFlipY, boolean isRote90) {
        for (int x = 0; x < titleWidth; x++) {
            int xx = isFlipX ? titleWidth - 1 - x : x;
            for (int y = 0; y < titleHeight; y++) {
                int yy = isFlipY ? titleHeight - 1 - y : y;
                int color = Integer.parseInt(str_titles[xx * titleHeight + yy]);
                if (isRote90) {
                    outPixmap.drawPixel(y + px, x + py, color);
                } else {
                    outPixmap.drawPixel(x + px, y + py, color);
                }
            }
        }
    }

    private static class Defeat {
        public final static String str_homeh = "UEsDBBQACAgIAAyqm0wAAAAAAAAAAAAAAAABAAAAMO3TQU6DUBRA0Q1hQoEW3f/GhKozG4IObpuc\n" +
                "wX8hhcE9eb/jMA7rbbh8jMO0TPezP6/r9vs4vE3X2wuNcbjMm+F6/fXs716OtC3ikefnrO9P0Hlq\n" +
                "3G/bgWr/pi89NaZlPmRNy/IEpedYR6Tv05diYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdi\n" +
                "YeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqF\n" +
                "lZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZW\n" +
                "XoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5\n" +
                "KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWl\n" +
                "WFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdi\n" +
                "YeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqF\n" +
                "lZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZW\n" +
                "XoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWlWFh5KRZWXoqFlZdiYeWl51jL\n" +
                "fMxalicoPTUuH+Mha/+mLz011uN7uK5P0PmHhc3T40Vt7/rCf+1t/bqRy3T/w+3PL7qn+/gEUEsH\n" +
                "CBOKrUKKAgAANE4BAA==";

        public static String[] getStr_homehs() {
            String unzip = unzip(str_homeh);
            return unzip.split(",");
        }

        public final static String str_homew = "UEsDBBQACAgIAC+xm0wAAAAAAAAAAAAAAAABAAAAMO3U0WrDIBQG4BdyYDzJmrz/i01tu+1io21u\n" +
                "zmAfchSjkg/5sZbaWytHLcsepcVW2rbNccyPsVZne2vbe0Y3/h1raTWust+qr3d0rnQ444HzXnHz\n" +
                "Zmlbv7L1OernFff9ad79eA17q34sS7xc9lPkcS4tFfFiJu7V8u75lHdWXprPmzdmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZm\n" +
                "ZmZmZmZmZmZmZmZmZmZmZuZ/bG555ljPmaOmmZfLfso8zmWZ9+MU+ci75VZafTEbY3+ad3YjzRFP\n" +
                "JjhK5D0WP8DrA3j9S+DvQekpXfaYb0JbjzmOef+cHIev7gNQSwcITT3+encCAABkuQEA";

        public static String[] getStr_homews() {
            String unzip = unzip(str_homew);
            return unzip.split(",");
        }


        public final static String str_angle = "UEsDBBQACAgIAO+Lm0wAAAAAAAAAAAAAAAABAAAAMO2ca67jIAyFN+SRMAQC+9/Y2NXVaB63nSQF\n" +
                "bNKjyEfqj0o5X6mDwSTmTBHRJzgT7xJpJw6BSqYU6UfM5bCYW1g1EhPXKOgz1UbbRkzh14WfYAjy\n" +
                "JsgFdAq07xTLb8CBvn9wJc6Vmoxu/hY1kHfBLLk7R6pVPr7EDNjXIknKKBs1wVEPAAbmU8FNIkbK\n" +
                "R8mC8JHYkgzaQi0QbyfBAu6ziJJqt53KfoEouH7DMzxKj3xlhILpXyy1lijn0yh4/hlJEqdUY/nI\n" +
                "XAosn4Q+fAKV1oXhR3LkKg/v12UTGD4Lfa7E9KzCB8HXI69EKqkzufvTC404yNxwALgbo+PClK9P\n" +
                "pz+Pm07zuMhQG8bsZtR0kX1/r8D4IGK8FUpjcti9eEVhxYn6ztBuCItbpTr677c8KZYMlY8vLn8k\n" +
                "J5aqckJqWpiSrv/wuMnU2ox0hz3OSdjrAdKBw3EymjXwaJ9G6LMYeC84UQteizHjG81jvFhh8QpG\n" +
                "84vRn8grFn0emaRcx1D0AW0JxBmSx3wOQL5g6KbS3MmtWx5aLk4thdzS0OWFiYWzXxYxz1tmcU1C\n" +
                "V+WsAZiD0GVc6yeHMQZd93eRI+0oxAk7H84Z6F6ZtWlDBLq9OnSr0DeB0EZuLrv3r/0I1maN7D+a\n" +
                "WMytWpiPYUz3zgLe7ZcPTKxrq2D3VrcFnKfeDZJL+NbGWr/XGNsp9ewlXsS1dqFbG5trWk+BWW4S\n" +
                "GHhmVyXqeMsyO+lwQmUhx3q+ydrQPMPx7cNcS/nVw4DWZmbZ3dI75x4Xc6tHZ62NTDPbrF1M8vo4\n" +
                "ae4/O/XxGm1bC2ZZTZv/+UQXp/oGCmsDU4y2NTLvez55P/MuEevrsk99L431zU+wWdf5Ka+65INv\n" +
                "F/JyXXLJTjpJhppsnhfSenhM/33fmLfrtEd20+ozzmKyvuXhFvcVyunrDhP73ZXq4lA7jE59AbKm\n" +
                "6Dta7e8CMlxqc3ATkOGybQ5uAjJc2ME9QCAQCAQCgUAgEAgEAoFAIBAIBAKBQCD/yE9QSwcIryFV\n" +
                "i/gCAAD1eAAA";

        public static String[] getStr_angles() {
            String unzip = unzip(str_angle);
            return unzip.split(",");
        }

        public static String str_title = "UEsDBBQACAgIAI6Lm0wAAAAAAAAAAAAAAAABAAAAMO3djXLjqBKG4RviVNE00HD/N3bAsxGejO3Y\n" +
                "iRyQ/Zb2yfk2ezKjyFTRkvhR78TEhZQAAADwBnrtp971oxQXdP4ZAQAA4ElarddKPr8dIbjgbf55\n" +
                "AQAAYF+9xgtndd+p9uvfo/YDAAB4Gb22s081Xz9i+34s888PAAAAP9Nqunip3uuHZJ1/ggAAAPiR\n" +
                "XtNdrva8S3H66QEAAOBnWkl3rdrzLkQKPgAAgMOKtyq9VusJg/cAAAAOS8rNWk/qAucIAACAb+m1\n" +
                "3M1ajy05cABSUjDVqC4G8ZZi+14OKlVSEmdVcpCs4qqvKYRczNWqpmbBnPgYQ87W/o9ncfz38TPj\n" +
                "zxl/9vj7xjnMvhoAADxbrxBvVpAxTz9H4JJRsSVrZV9IvdoLWXPK7b7ocl24QqxRgy/mz8+b6hMA\n" +
                "8Np6RXmz4gzMO8Fa1KtY1Fpd8SXmmLUuUUk+K47fcvzmsz8DAAD21OvNW/VoZT8TLMIHkay9QAtJ\n" +
                "veV47fX3+8VxRcZVmv55AQCwg3ptLe4/h80/Q7w31VxyMHGp1ORT0v4ePlgMalGXqBNXjtuFGldv\n" +
                "u6CzP1kAAH7Cbs9YSmH6GeJ9SZJUTIO5EoMkn9PKA0mPFs+u6XadZ3/iAAB8Vytab66uSS+HSaTU\n" +
                "VDVVV7P3SUzWqARfOVbLpUaTenb1p7cDAAC+4/bIgwVOEG9nzE0SLz4Vb8rT2llx+wCYMQYAOK7b\n" +
                "oxT89PPDm9FWXgXNRq27atw+lpBrLEULa3kBAI7ldu1L9YvfM4aKjhfraxR8xHsGQTDUFwBwPFTC\n" +
                "WMG2DgDz0o4exyfI4g4AgEOhKsYKzlcZm1/YEfeK43Od3cIAALgHlTGm2zZAWKGWIz43st0FAOA4\n" +
                "qJMx23vs5Uv8E882iFug7QEAcMuXdXJkwww8z/kaa/NrOOKMyIpuAIAjiF9XzVoWOE+8Kp4sE0cb\n" +
                "mN0aAQC47o6qmTWc8CRSUjDVqEvUbsSF4tYyZrdRAAAuu70P9KmG9jx5xnOwGgbxclx/PQ3JJWrI\n" +
                "6tR8ijmqOPMWfU5VXPU1hZALm98QiUTiO8da1dQsmCs1ZKvtn7O+YvQfW5cyu28D8KB4e8f5fkhh\n" +
                "bAWeo/UsmlOu3GcQP5UfW8uY3UYvOS0p76PQgolEIpG4exxdi6Z2v60xcJMNHIqWr2+weXiGJxhb\n" +
                "wq7QmxGXj8ttIby9W0gpFamJPamJRCKROCMmayGkXlHx1hs4kPD1qHFRVvnD/mIQbykm3hES74mj\n" +
                "vcxuuR+4/yYSiUTicjH7rLEkli4ADkFq/vJmvDKDG/sbncUKXRdx9bhWcTHGna9wbYhEIpFIvBpH\n" +
                "lzW78wRwm+Sv7su9y7wlx/4sWdWUubch3hXNolnJC0yK2wYDjpVyVrhARCKRSCRejWddFkPagfWJ\n" +
                "fH2PLnn6aeL1nC8RPb/vIq4eR3Uxu+WOJXRWuC5EIpFIJD4Yx8rrs7tUANfp1zPO+26/3KljX2Pr\n" +
                "jhU6LOLqsVouNZrMv0vPrd0Gn4wxIEQikUg8ZBw7pc3uUgFcc88tundi3KRjXyv0UsRDxWAxqC0w\n" +
                "FZ1hIEQikUg8dBwd2ewuFcAVKvfdprPIBHa2Qi9FPFRc5jb97FTWuDJEIpFIJD4Yl+lUAVwm9vVu\n" +
                "5/1IrO2OfTHmnfhIXGfM+wpXg0gkEonEXeLsThXAZeL1rrv07ALP27Ajxg0TH4nrLB/H4yUikUgk\n" +
                "HjzyJh1YWnRy38T0PjV99snilbALG/GRuM4ubMVS0XZSa1wXIpFIJBIfjExKB5am992cn27QvZ9/\n" +
                "vngZ2WeNJTGnl3hXHO1lestlcXcikUgkHjmyuDuwMsn3rRh32oGtV8Zh+injNcQg3lJM3OUQ74mj\n" +
                "vcxuuWyRTiQSicRDR7ZIB1YW4923595JmT//E69BkqRiyjxe4n1xay/TW24uUUPWs0nxS1wgIpFI\n" +
                "JBKvxbMu66MXm92dAvhE71u+fQxt5wkb9tN6Cc0pV16dE/+Oo2XMbqMfVHPJPrJOApFIJBJXj6PL\n" +
                "mt15AviX5HuXffvvBrz9WIzTTxuvIZWafErKPQ3x7zhaxuw2+ld7TalITcKbcCKRSCQuE9dZdwXA\n" +
                "FfWhG+5+y81gdOxDSgqmylJuxM9xaxmz2+hf7fVj8B433kQikUicGJO1EFKfzMewcmBh8uiNtncp\n" +
                "zz9tvIziS8wxKzct7xtHG5jdGq8Zg/SYDUEkEonEnePoWsaan7M7PgDX9X3EHj+kzl+5CK9BvYpF\n" +
                "rdxAv28cbWB2a7xlex0wVoIde7aM7VXFB2uljzEAg0gkEt8xbn3A6BhGZzE6kNOD2WCseAQsLT42\n" +
                "ifrjKOwBhv3wuvmdYglJveXI0zYAwDrkwYV9P45WEYuffvZ4ET6IZF2kYiM+N45Pe3q7AwCgi+Ye\n" +
                "2X+Sh8R4ElbcfM245nqZAID39t3HwacJBS54VpzHPrZBdSUGST4nCuGjxvEJMlISALCW2Hy78vUu\n" +
                "U/hiP5IkFdNgrlouNRrr6R4gnn1W2+c3uyUBAPBB5Cel7ulRb6Znw440FR8094U3xLdsjHtYLG4f\n" +
                "S8g1lqKFdeEAAAsJ+Ye1re87//WVIqb/KngZ5wskUuCuUsoeY8lCAMC7ia79z0+rWd96vLLAL4OX\n" +
                "IqWmqqkyQmHC+IJx9ae3AwAAzojJDpVrX2dMKpu9Yl9jfCazy/aPZ9eUcbAAgDXF8O0Vvz4fqu2P\n" +
                "Y24z9rVNmj9fEozt6e6M24UaV49VCAAAi4ou605VaT8qo1nxJNti/mxr9s+D0LH1F1seAACWJumn\n" +
                "iwN8PmSB3wqva8zieY8KdPyWzF8CAByA/Hxq/ufj9GRl/m+GlyYlBVPtL5GtFWEh9YVZQ9accl15\n" +
                "4Og4x3He43eZfVUBALgpRid7zIP/fITiQuDZCX7HmAwTg3hLsX0v+6yxpFaNmUWzkoO66msKIZdW\n" +
                "Y1Y1NetV28UhjTV7n8REzn7GquR2p6Xi2p8lVVL7kfH3MSEHAHA0waU9x0SeH7FVgjwRAQAA+IHo\n" +
                "yvc3kr/jta+0eo0ndwAAAN8h4VkP1T6O0gfoMUgPAADgEaLPfJr2cVTvKNQAAADuI/E3CrTT0zTl\n" +
                "1ScAAMAXROsvFWf9MGUuAQAAwEXRSXjGsh63jtj+YhY/AAAAOBP6cP3frcn60ZdiYyFfAACA09K3\n" +
                "T1v07KvDnKQ8/xIAAADMIq0eipNKsT9HDa0gZAdxAADwTvo+UDK1BPtzqDqpPBoDAABvIAaXZ72N\n" +
                "/HwEJ76cTmn6ZQEAANhddGLi5r58/Kf+qu2k/AIXBwAAYCfBXPrt1SnuO7K44OP8KwQAAPBdMZ1e\n" +
                "5c0uq64fctrCUhh5DwAADiTaaQvJGSt7PXYEZ5Wx9QAAYG0xtNIqLjY46/aRspNUTouLTb98AAAA\n" +
                "nRQnfnaR9L1D+rvMVhGWvkM3UxMBAMAv01ZGZe0T9Z5Z8fwvpPx2X0I8VahiiRVZAQDAk8RWzrV6\n" +
                "I4uLK9Q/fJnyJbnUanrJrfBsDSLMbpQAAOCYpNURfSWvxmuzQJXDl6W/iLkc/rzl1vZvuSl993Y7\n" +
                "taQQfaMLtGwAAPB88T99k8rsgvZ6IDqp/S10rxeq07hA+bLwl/8DUEsHCNI0CX9/CgAAw8MDAA==";

        public static String[] getStr_titles() {
            String unzip = unzip(str_title);
            return unzip.split(",");
        }
    }

    /**
     * 使用zip进行解压缩
     *
     * @return 解压后的字符串
     */
    public static final String unzip(String compressedStr) {
        if (compressedStr == null) {
            return null;
        }

        ByteArrayOutputStream out = null;
        ByteArrayInputStream in = null;
        ZipInputStream zin = null;
        String decompressed = null;
        try {
            byte[] compressed = new sun.misc.BASE64Decoder().decodeBuffer(compressedStr);
            out = new ByteArrayOutputStream();
            in = new ByteArrayInputStream(compressed);
            zin = new ZipInputStream(in);
            zin.getNextEntry();
            byte[] buffer = new byte[1024];
            int offset = -1;
            while ((offset = zin.read(buffer)) != -1) {
                out.write(buffer, 0, offset);
            }
            decompressed = out.toString();
        } catch (IOException e) {
            decompressed = null;
        } finally {
            if (zin != null) {
                try {
                    zin.close();
                } catch (IOException e) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
        return decompressed;
    }

    /**
     * 使用zip进行压缩
     *
     * @param str 压缩前的文本
     * @return 返回压缩后的文本
     */
    public static final String zip(String str) {
        if (str == null)
            return null;
        byte[] compressed;
        ByteArrayOutputStream out = null;
        ZipOutputStream zout = null;
        String compressedStr = null;
        try {
            out = new ByteArrayOutputStream();
            zout = new ZipOutputStream(out);
            zout.putNextEntry(new ZipEntry("0"));
            zout.write(str.getBytes());
            zout.closeEntry();
            compressed = out.toByteArray();
            compressedStr = new sun.misc.BASE64Encoder().encodeBuffer(compressed);
        } catch (IOException e) {
            compressed = null;
        } finally {
            if (zout != null) {
                try {
                    zout.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
        return compressedStr;
    }

    //原生输入框
    private HashMap<NativeTextField,VTextField> textFieldHashMap;

    private Pool<VTextField> pool_textFields=new Pool<VTextField>() {
        @Override
        protected VTextField newObject() {
            VTextField textfield = new VTextField();
            return textfield;
        }
    };

    private JDialog pref;

    public class VTextField extends JDialog implements Pool.Poolable{
        private NativeTextField nativeTextField;
        private JTextField textField;
        private JTextField textMessage;
        private JPanel panel;
        private DocumentListener documentListener;
        private MouseListener mouseListener;
        private KeyListener keyListener;
        private FocusListener focusListener;

        public VTextField(){
            super(pref==null?appFrame:pref);
           // super(pref);
            setLayout(null);
            setUndecorated(true);//禁用或启用窗口装饰，如果为true,则为没有启动窗口装饰，只有在窗口不可见时才能调用，否则会抛出异常
            getRootPane().setWindowDecorationStyle(JRootPane.NONE);//设置不使用窗口装饰
            AWTUtilities.setWindowOpaque(this,false);
            pref=this;
            setName ("root");

            panel = new JPanel(){
                public void paintComponent(Graphics g){
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                   // g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
                    g2d.setComposite(AlphaComposite.DstAtop);
                    g2d.setColor(textField.getBackground());
                    Shape shape = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 18, 18);
                    g2d.fill(shape);
                }
            };
            textMessage=new JTextField();

            textField = new JTextField();
            textField.setLocation(0,9);
            setBorderStyle(NativeTextField.BorderStyle.RoundedRect);
            textField.setFont(VDesktopLauncher.this.getFont(game.getDefaultPaint()));
            add(textField);
            textField.setVisible(false);

            textMessage.setLocation(0,9);
            textMessage.setForeground(java.awt.Color.gray);
            textMessage.setFont(textField.getFont());
            add(textMessage);

            appFrame.addComponentListener(new ComponentAdapter() {
                public void componentMoved(ComponentEvent componentEvent) {
                    if(isVisible()) setLocation(appFrame.getX()+1+sysX,appFrame.getY()+sysY);
                }
            });

            textField.addFocusListener(focusListener=new FocusListener() {
                public void focusLost(FocusEvent e) {//失去焦点时
                    if(textField.getText()==null||textField.getText().equals("")){
                        if(textField.isVisible()) {
                            textField.setVisible(false);
                            textMessage.setVisible(true);
                        }
                    }
                    Gdx.app.postRunnable(new Runnable() {
                        public void run() {
                            NativeTextField.TextFieldListener textFieldListener =nativeTextField.getTextFieldListener();
                            if(textFieldListener!=null){
                                textFieldListener.didEndEditing(nativeTextField);
                            }
                        }
                    });
                }
                public void focusGained(FocusEvent e) {//获得焦点时
                    Gdx.app.postRunnable(new Runnable() {
                        public void run() {
                            NativeTextField.TextFieldListener textFieldListener =nativeTextField.getTextFieldListener();
                            if(textFieldListener!=null){
                                textFieldListener.didBeginEditing(nativeTextField);
                            }
                        }
                    });
                }
            });

            textField.addKeyListener(keyListener=new KeyListener() {
                @Override
                public void keyTyped(KeyEvent event) {
                    //System.out.println("删除键");
                }

                @Override
                public void keyPressed(KeyEvent event) {
                }

                @Override
                public void keyReleased(KeyEvent event) {
                    nativeTextField.setText(textField.getText());

                    Gdx.app.postRunnable(new Runnable() {
                        public void run() {
                            NativeTextField.TextFieldListener textFieldListener =nativeTextField.getTextFieldListener();
                            if(textFieldListener!=null){
                                String text=textFieldListener.onEditingChanged(nativeTextField);
                                if(text!=null) {
                                    textField.setText(text);
                                    textField.requestFocus();
                                    textField.setSelectionStart(text.length());
                                    textField.setSelectionEnd(text.length());
                                    nativeTextField.setText(text);
                                }
                            }
                        }
                    });


                    switch (event.getKeyCode()){
                        case KeyEvent.VK_BACK_SPACE:
                            if(textField.getText()==null||textField.getText().equals("")){
                                if(textField.isVisible()) {
                                    textField.setVisible(false);
                                    textMessage.setVisible(true);
                                }
                            }
                            break;
                        case KeyEvent.VK_ENTER:
                            Gdx.app.postRunnable(new Runnable() {
                                public void run() {
                                    NativeTextField.TextFieldListener textFieldListener
                                            =nativeTextField.getTextFieldListener();
                                    if(textFieldListener!=null){
                                        textFieldListener.shouldReturn(nativeTextField);
                                    }
                                }
                            });
                            break;
                    }
                }
            });

            textMessage.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                    textField.setVisible(true);
                    textMessage.setVisible(false);
                    textField.requestFocus();
                    textField.setFocusable(true);
                }

                @Override
                public void mousePressed(MouseEvent mouseEvent) {

                }

                @Override
                public void mouseReleased(MouseEvent mouseEvent) {

                }

                @Override
                public void mouseEntered(MouseEvent mouseEvent) {

                }

                @Override
                public void mouseExited(MouseEvent mouseEvent) {

                }
            });

            setFocusable(true);
        }

        //获得焦点
        public void becomeFirstResponder(){
            textField.setVisible(true);
            textMessage.setVisible(false);
            textField.requestFocus();
            textField.setFocusable(true);
        }

        public void setSecureTextEntry(boolean isPasswordMode){
            JTextField newTextField=isPasswordMode?new JPasswordField():new JTextField();
            newTextField.setText(textField.getText());
            newTextField.setBounds(textField.getBounds());
            newTextField.setVisible(textField.isVisible());
            newTextField.setBackground(textField.getBackground());
            newTextField.setForeground(textField.getForeground());
            newTextField.setFont(textField.getFont());
            newTextField.setBorder(textField.getBorder());
            newTextField.setOpaque(textField.isOpaque());
            newTextField.addMouseListener(mouseListener);
            newTextField.addKeyListener(keyListener);
            newTextField.addFocusListener(focusListener);
            remove(textField);
            add(newTextField);
            textField=newTextField;
        }

        public void setText(String text){
            if(text.equals("")){
                if(textField.isVisible()){
                textField.setVisible(false);
                textMessage.setVisible(true);
                }
             }else{
                if(!textField.isVisible()) {
                    textField.setVisible(true);
                    textMessage.setVisible(false);
                }
            }
        }


        public void setFontColor(Color color){
            //fontColor=getColor(color);
            textField.setForeground(getColor(color));
        }

        public void setMessageColor(Color color){
            //this.messageColor=getColor(color);
            textMessage.setForeground(getColor(color));
        }

        public void setMessageText(){
            if(!nativeTextField.getMessageText().equals("")){
                textField.setVisible(false);
                textMessage.setVisible(true);
                textMessage.setText(nativeTextField.getMessageText());
            }else{
                textField.setVisible(true);
                textMessage.setVisible(false);
            }
        }

        public void setBackgroundColor(Color color){
            textField.setBackground(getColor(color));
            textMessage.setBackground(textField.getBackground());
        }

        public void setTintColor(Color color){
            textField.setCaretColor(getColor(color));
            textMessage.setCaretColor(textField.getCaretColor());
        }

        public void setSize(int w,int h){
            super.setSize(w,h);
            panel.setSize(w,h);
            if(nativeTextField==null||nativeTextField.getBorderStyle()!= NativeTextField.BorderStyle.RoundedRect){
                textField.setSize(getWidth(),getHeight());
                textField.setLocation(0,0);
                textMessage.setSize(getWidth(),getHeight());
                textMessage.setLocation(0,0);
            }else {
                textField.setSize(getWidth(),getHeight()-18);
                textField.setLocation(0,9);
                textMessage.setSize(getWidth(),getHeight()-18);
                textMessage.setLocation(0,9);
            }

        }

        public void setFontSize(int fontSize){
            textField.setFont(new Font(null,0,fontSize));
            textMessage.setFont(textField.getFont());
        }

        public void setLibgdxTextField(NativeTextField nativeTextField){
            this.nativeTextField=nativeTextField;
        }

        public void setBorderStyle(NativeTextField.BorderStyle borderStyle){
            switch (borderStyle){
                case None:
                    textField.setOpaque(false);
                    textField.setBorder(BorderFactory.createEmptyBorder());
                    textMessage.setOpaque(false);
                    textMessage.setBorder(textField.getBorder());
                    remove(panel);
                    break;
                case Line:
                    textField.setOpaque(true);
                    textField.setBorder(BorderFactory.createLineBorder(getColor(Color.BLACK)));
                    textMessage.setOpaque(true);
                    textMessage.setBorder(textField.getBorder());
                    remove(panel);
                    break;
                case Bezel:
                    textField.setOpaque(true);
                    textField.setBorder(BorderFactory.createEmptyBorder());
                    textMessage.setOpaque(true);
                    textMessage.setBorder(textField.getBorder());
                    remove(panel);
                    break;
                case RoundedRect:
                    textField.setOpaque(true);
                    textField.setBorder(BorderFactory.createEmptyBorder());
                    textMessage.setOpaque(true);
                    textMessage.setBorder(textField.getBorder());
                    add(panel,0);
                    break;
            }
            setSize(getWidth(),getHeight());
        }


        public void  setTextAlignment(int alignment){
           switch (alignment){
               case Align.left:
                   textField.setHorizontalAlignment(JTextField.LEFT);
                   textMessage.setHorizontalAlignment(JTextField.LEFT);
                   break;
               case Align.bottomLeft:
                   textField.setHorizontalAlignment(JTextField.LEFT);
                   textMessage.setHorizontalAlignment(JTextField.LEFT);
                   break;
               case Align.topLeft:
                   textField.setHorizontalAlignment(JTextField.LEFT);
                   textMessage.setHorizontalAlignment(JTextField.LEFT);
                   break;
               case Align.right:
                   textField.setHorizontalAlignment(JTextField.RIGHT);
                   textMessage.setHorizontalAlignment(JTextField.RIGHT);
                   break;
               case Align.bottomRight:
                   textField.setHorizontalAlignment(JTextField.RIGHT);
                   textMessage.setHorizontalAlignment(JTextField.RIGHT);
                   break;
               case Align.topRight:
                   textField.setHorizontalAlignment(JTextField.RIGHT);
                   textMessage.setHorizontalAlignment(JTextField.RIGHT);
                   break;
               case Align.top:
                   textField.setHorizontalAlignment(JTextField.CENTER);
                   textMessage.setHorizontalAlignment(JTextField.CENTER);
                   break;
               case Align.center:
                   textField.setHorizontalAlignment(JTextField.CENTER);
                   textMessage.setHorizontalAlignment(JTextField.CENTER);
                   break;
               case Align.bottom:
                   textField.setHorizontalAlignment(JTextField.CENTER);
                   textMessage.setHorizontalAlignment(JTextField.CENTER);
                   break;
           }
        }


       // private String prefText;
        public void setVisible(boolean isVisible){
            if(isVisible){
                setLocation(appFrame.getX()+1+sysX,appFrame.getY()+sysY);
                //setText(textField.getText());
            }
            super.setVisible(isVisible);
        }


        //本地输入框同步为 libgdx 端坐标
        private int sysX,sysY;
        public void synchronousPosition(){
            if(nativeTextField.getStage()!=null) {
                Stage stage = nativeTextField.getStage();
                float blx,bly;
                float fullWidth,fullHeight,cutWidth=0,cutHeight=0;
                if(stage instanceof VStage){
                    VStage vStage= (VStage) stage;
                    fullWidth=vStage.getFullWidth();
                    fullHeight=vStage.getFullHeight();
                    cutWidth=vStage.getCutWidth();
                    cutHeight=vStage.getCutHeight();
                }else {
                    fullWidth=stage.getWidth();
                    fullHeight=stage.getHeight();
                }
                blx= (1f/fullWidth*Gdx.graphics.getWidth());
                bly= (1f/fullHeight*Gdx.graphics.getHeight());
                float fx=nativeTextField.getX();
                float fy=nativeTextField.getY();
                Group father=nativeTextField.getParent();
                Group root=stage.getRoot();
                float dx=root.getX()/root.getScaleX()-cutWidth;
                float dy=root.getY()/root.getScaleY()-cutHeight;
                fx+=dx;
                fy+=dy;
                while(father!=root){
                    Group nextFather=father.getParent();
                    fx+=father.getX();
                    fy+=father.getY();
                    father=nextFather;
                    if(father==null){
                        setVisible(false);
                        return;
                    }
                }
                sysX= (int) ((cutWidth+fx)*blx);
                float my=(cutHeight+fy)*bly;
                sysY= (int) ((appFrame.getHeight()-getHeight())-my);
                setLocation(appFrame.getX()+sysX+1,appFrame.getY()+sysY);
            }else setVisible(false);
        }

        public void synchronousSize(){
            if(nativeTextField.getStage()!=null) {
                Stage stage = nativeTextField.getStage();
                float blx,bly;
                int w,h;
                float fullWidth,fullHeight;
                if(stage instanceof VStage){
                    VStage vStage= (VStage) stage;
                    fullWidth=vStage.getFullWidth();
                    fullHeight=vStage.getFullHeight();
                }else {
                    fullWidth=stage.getWidth();
                    fullHeight=stage.getHeight();
                }
                blx= (1f/fullWidth*Gdx.graphics.getWidth());
                bly= (1f/fullHeight*Gdx.graphics.getHeight());
                w= (int) (nativeTextField.getWidth()*blx);
                h= (int) (nativeTextField.getHeight()*bly);
                setSize(w,h);
                synchronousPosition();
            }else {
                setVisible(false);
            }
        }

        @Override
        public void reset() {

        }
    }

    public void linkNativeTextField(NativeTextField nativeTextField,NativeTextField.Method method){
        switch (method){
            case newObject:
                if(textFieldHashMap==null){
                    textFieldHashMap=new HashMap<>();
                }
                VTextField textfield = pool_textFields.obtain();
                textfield.setLibgdxTextField(nativeTextField);
                textFieldHashMap.put(nativeTextField,textfield);
                break;
            case positionChanged:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.synchronousPosition();
                break;
            case sizeChanged:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.synchronousSize();
                break;
            case setVisible:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setVisible(nativeTextField.isVisible());
                break;
            case setHidden:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setVisible(!nativeTextField.isHidden());
                break;
            case becomeFirstResponder:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.becomeFirstResponder();
                break;
            case resignFirstResponder:
//                textfield = textFieldHashMap.get(nativeTextField);
//                textfield.resignFirstResponder();
                break;
            case setText:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setText(nativeTextField.getText());
                break;
            case setFontColor:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setFontColor(nativeTextField.getFontColor());
                break;
            case setBackgroundColor:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setBackgroundColor(nativeTextField.getColor());
                break;
            case setBorderStyle:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setBorderStyle(nativeTextField.getBorderStyle());
                break;
            case setFontSize:
                textfield = textFieldHashMap.get(nativeTextField);
                float fontSize=nativeTextField.getFontSize();
                if(fontSize==0)return;
                if(nativeTextField.getStage()!=null) {
                    Stage stage = nativeTextField.getStage();
                    float blx;
                    float fullWidth;
                    if (stage instanceof VStage) {
                        VStage vStage = (VStage) stage;
                        fullWidth = vStage.getFullWidth();
                    } else {
                        fullWidth = stage.getWidth();
                    }
                    blx = 1f / fullWidth * Gdx.graphics.getWidth();
                    textfield.setFontSize((int) (nativeTextField.getFontSize()*blx));
                }
                break;
            case setPasswordMode:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setSecureTextEntry(nativeTextField.isPasswordMode());
                break;
            case setTintColor:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setTintColor(nativeTextField.getTintColor());
                break;
            case setMessageColor:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setMessageColor(nativeTextField.getMessageColor());
                break;
            case setMessageText:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setMessageText();
                break;
            case setAlignment:
                textfield = textFieldHashMap.get(nativeTextField);
                textfield.setTextAlignment(nativeTextField.getAlignment());
                break;
            case remove:
                textfield = textFieldHashMap.get(nativeTextField);
                nativeTextField.setHidden(true);
                nativeTextField.setVisible(false);
                textfield.setVisible(false);
                //pool_textFields.free(textfield);
                textFieldHashMap.remove(textfield);
                break;
        }
    }
}
