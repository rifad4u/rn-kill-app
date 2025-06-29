import type { TurboModule } from "react-native";
import { TurboModuleRegistry } from "react-native";

export interface Spec extends TurboModule {
    killApp: () => void;
};

export default TurboModuleRegistry.getEnforcing<Spec>("RnKillApp");