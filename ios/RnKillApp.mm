#import "RnKillApp.h"

#if RCT_NEW_ARCH_ENABLED
#import <RnKillAppSpec/RnKillAppSpec.h>
#endif

@implementation RnKillApp

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(killApp)
{
    exit(0);
};

# pragma mark - New Architecture

#if RCT_NEW_ARCH_ENABLED

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeRnKillAppSpecJSI>(params);
}

#endif

@end
