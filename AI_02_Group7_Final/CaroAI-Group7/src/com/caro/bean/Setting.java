package com.caro.bean;
import java.awt.Color;
import com.caro.dao.SettingDao;

/**
 * Thông tin setting
 */
public class Setting {
	private Color backgroundColor;
	private Color cellColor;
	private Color xColor;
	private Color oColor;
	private int mode;
	private int pvp; //neu pvp = 0 thi danh vs nguoi, =1 danh vs bot
	
	public Setting(Color backgroundColor, Color cellColor, Color xColor, Color oColor, int mode, int pvp) {
		super();
		this.backgroundColor = backgroundColor;
		this.cellColor = cellColor;
		this.xColor = xColor;
		this.oColor = oColor;
		this.mode = mode;
		this.pvp = pvp;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}
	
	public String getStringBackgroundColor() {
		String result = String.valueOf(backgroundColor.getRed())+","+String.valueOf(backgroundColor.getGreen())+","+String.valueOf(backgroundColor.getBlue());
		return result;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		SettingDao.SaveSettingInfo(this);
	}

	public Color getCellColor() {
		return cellColor;
	}
	
	public String getStringCellColor() {
		String result = String.valueOf(cellColor.getRed())+","+String.valueOf(cellColor.getGreen())+","+String.valueOf(cellColor.getBlue());
		return result;
	}

	public void setCellColor(Color cellColor) {
		this.cellColor = cellColor;
		SettingDao.SaveSettingInfo(this);
	}

	public Color getxColor() {
		return xColor;
	}
	
	public String getStringXColor() {
		String result = String.valueOf(xColor.getRed())+","+String.valueOf(xColor.getGreen())+","+String.valueOf(xColor.getBlue());
		return result;
	}

	public void setxColor(Color xColor) {
		this.xColor = xColor;
		SettingDao.SaveSettingInfo(this);
	}

	public Color getoColor() {
		return oColor;
	}
	
	public String getStringOColor() {
		String result = String.valueOf(oColor.getRed())+","+String.valueOf(oColor.getGreen())+","+String.valueOf(oColor.getBlue());
		return result;
	}

	public void setoColor(Color oColor) {
		this.oColor = oColor;
		SettingDao.SaveSettingInfo(this);
	}
	//Chon nguoi hoac bot di trc
	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
		SettingDao.SaveSettingInfo(this);
	}
	
	//Chon choi voi nguoi hoac may
	public int getPvP() {
		return pvp;
	}

	public void setPvP(int pvp) {
		this.pvp = pvp;
		SettingDao.SaveSettingInfo(this);
	}
	
}
