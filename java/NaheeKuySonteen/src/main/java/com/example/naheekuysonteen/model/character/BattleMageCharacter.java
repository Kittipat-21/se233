package com.example.naheekuysonteen.model.character;

import com.example.naheekuysonteen.model.DamageType;

public class BattleMageCharacter extends BasedCharacter{
    public BattleMageCharacter(String name,String imgpath,int basedDef,int basedRes) {
        this.name = name;
        this.type = DamageType.battlemage;
        this.imgpath = imgpath;
        this.fullHP = 40;
        this.basedPow = 40;
        this.basedDef = basedDef;
        this.basedRes = basedRes;
        this.hp = this.fullHP;
        this.power = this.basedPow;
        this.defense = basedDef;
        this.resistance = basedRes;
    }
}
