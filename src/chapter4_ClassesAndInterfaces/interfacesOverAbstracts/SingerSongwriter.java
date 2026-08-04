package chapter4_ClassesAndInterfaces.interfacesOverAbstracts;

import java.applet.AudioClip;

public interface SingerSongwriter extends Singer, Songwriter{
  AudioClip strum();
  void actSensitive();
}
