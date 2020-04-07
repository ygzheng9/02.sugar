package com.demo.common.model;

import com.demo.common.model.base.BaseSoItm;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class SoItm extends BaseSoItm<SoItm> {

    /**
     * 非数据库字段，手工增加出的字段；
     */
    private int dirty;

    public void markDirty() {
        this.dirty = 1;
    }
    public boolean isDirty() { return this.dirty != 0;}
	
}