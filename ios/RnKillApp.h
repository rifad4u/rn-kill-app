#ifdef RCT_NEW_ARCH_ENABLED
#import <RnKillAppSpec/RnKillAppSpec.h>

@interface RnKillApp : NSObject <NativeRnKillAppSpec>
#else
#import <React/RCTBridgeModule.h>

@interface RnKillApp : NSObject <RCTBridgeModule>
#endif

#import <Foundation/Foundation.h>
@end
