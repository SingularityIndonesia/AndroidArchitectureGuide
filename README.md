# AndroidArchitectureGuide
## Modularization Rule
- **Navigation is The Highest Level Module**.
- **Independent Domain**.
  Domain shall not depend on anything, but it can depen on lIbs.
  Domain should not have instance. Domain is contract Layer. It can only contain contract and Types/Entity/Model.
- **Feature can depend on Multiple Domains**, but should not depend on one another.
- **Lib's modules have tobe "Runtime Free"**. This module should not depend on App Runtime Process. Therefore, everybody can depend on this module(s) directly.
- **Libs are collection of statics**, it should not contain classes, but it can contain objects, types, and functions.

Check this [Architecture Overview Miro](https://miro.com/app/board/uXjVMmuRGFc=/?share_link_id=614519646990).