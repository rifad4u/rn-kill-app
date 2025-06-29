import NativeRnKillApp from "./NativeRnKillApp";

const killApp = () => {
    NativeRnKillApp.exitApp();
};

export { killApp };
export default NativeRnKillApp;