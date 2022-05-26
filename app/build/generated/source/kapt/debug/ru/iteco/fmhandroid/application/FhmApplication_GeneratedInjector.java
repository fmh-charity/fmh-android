package ru.iteco.fmhandroid.application;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = FhmApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface FhmApplication_GeneratedInjector {
  void injectFhmApplication(FhmApplication fhmApplication);
}
