package net.minecraft.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.net.URL;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.HttpUtil;

@SideOnly(Side.CLIENT)
class RunnableTitleScreen implements Runnable {

   // $FF: synthetic field
   final GuiMainMenu field_104058_d;


   RunnableTitleScreen(GuiMainMenu p_i23005_1_) {
      this.field_104058_d = p_i23005_1_;
   }

   public void run() {
      try {
         String var1 = HttpUtil.func_104145_a(new URL("http://assets.minecraft.net/1_6_has_been_released.flag"));
         if(var1 != null && var1.length() > 0) {
            var1 = var1.trim();
            synchronized(GuiMainMenu.func_104004_a(this.field_104058_d)) {
               GuiMainMenu.func_104005_a(this.field_104058_d, EnumChatFormatting.BOLD + "Notice!" + EnumChatFormatting.RESET + " Minecraft 1.6 is available for manual download.");
               GuiMainMenu.func_104013_b(this.field_104058_d, var1);
               GuiMainMenu.func_104006_a(this.field_104058_d, GuiMainMenu.func_104022_c(this.field_104058_d).func_78256_a(GuiMainMenu.func_104023_b(this.field_104058_d)));
               GuiMainMenu.func_104014_b(this.field_104058_d, GuiMainMenu.func_104007_d(this.field_104058_d).func_78256_a(GuiMainMenu.field_96138_a));
               int var3 = Math.max(GuiMainMenu.func_104016_e(this.field_104058_d), GuiMainMenu.func_104015_f(this.field_104058_d));
               GuiMainMenu.func_104008_c(this.field_104058_d, (this.field_104058_d.field_73880_f - var3) / 2);
               GuiMainMenu.func_104009_d(this.field_104058_d, ((GuiButton)GuiMainMenu.func_104019_g(this.field_104058_d).get(0)).field_73743_d - 24);
               GuiMainMenu.func_104011_e(this.field_104058_d, GuiMainMenu.func_104018_h(this.field_104058_d) + var3);
               GuiMainMenu.func_104012_f(this.field_104058_d, GuiMainMenu.func_104020_i(this.field_104058_d) + 24);
            }
         }
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

   }
}
