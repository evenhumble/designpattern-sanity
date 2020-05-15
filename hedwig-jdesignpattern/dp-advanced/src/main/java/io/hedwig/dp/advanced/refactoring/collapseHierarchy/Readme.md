Todays refactoring comes from Martin Fowlers catalog of patterns. You can find this refactoring in his
catalog here
Yesterday we looked at extracting a subclass for moving responsibilities down if they are not needed across the board. A Collapse Hierarchy refactoring would be applied when you realize you no longer need a subclass. When this happens it doesn’t really make sense to keep your subclass around if it’s properties can be merged into the base class and used strictly from there.
Here we have a subclass that isn’t doing too much. It just has one property to denote if the site is active or not. At this point maybe we realize that determing if a site is active is something we can use across the board so we can collapse the hierarchy back into only a Website and eliminate the StudentWebsite type.