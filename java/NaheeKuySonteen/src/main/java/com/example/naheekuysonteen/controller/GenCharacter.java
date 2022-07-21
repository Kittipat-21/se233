package com.example.naheekuysonteen.controller;

import com.example.naheekuysonteen.model.character.BasedCharacter;
import com.example.naheekuysonteen.model.character.BattleMageCharacter;
import com.example.naheekuysonteen.model.character.MagicalCharacter;
import com.example.naheekuysonteen.model.character.PhysicalCharacter;

import java.util.Random;

public class GenCharacter {
    public static BasedCharacter setUpCharacter() {
        BasedCharacter character;
        Random rand = new Random();
        int type = rand.nextInt(3);
        int basedDef = rand.nextInt(50)+1;
        int basedRes = rand.nextInt(50)+1;
        if (type == 0) {
            character = new MagicalCharacter("MagicChar","assets/wizard.png",basedDef,basedRes);
        }
        else if (type == 1) {
            character = new PhysicalCharacter("PhysicalChar","assets/knight.png",basedRes,basedDef);
        }
        else {
            character = new BattleMageCharacter("BattleMage","assets/battlemage.png",basedRes,basedDef);
        }
        return character;
    }
}
