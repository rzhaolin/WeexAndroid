/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.weex.common;

public class Constants {

  public interface Orientation {

    int HORIZONTAL = 0;
    int VERTICAL = 1;
  }

  public interface Weex {
    String REF = "ref";
    String INSTANCEID = "instanceid";
    String TYPE = "type";
  }

  public interface Name {

    String DEFAULT_WIDTH = "defaultWidth";
    String DEFAULT_HEIGHT = "defaultHeight";
    String HREF = "href";
    String WIDTH = "width";
    String MIN_WIDTH = "minWidth";
    String MAX_WIDTH = "maxWidth";
    String HEIGHT = "height";
    String MIN_HEIGHT = "minHeight";
    String MAX_HEIGHT = "maxHeight";
    String ALIGN_ITEMS = "alignItems";
    String ALIGN_SELF = "alignSelf";
    String FLEX = "flex";
    String FLEX_DIRECTION = "flexDirection";
    String JUSTIFY_CONTENT = "justifyContent";
    String FLEX_WRAP = "flexWrap";

    String MARGIN = "margin";
    String MARGIN_TOP = "marginTop";
    String MARGIN_LEFT = "marginLeft";
    String MARGIN_RIGHT = "marginRight";
    String MARGIN_BOTTOM = "marginBottom";
    String PADDING = "padding";
    String PADDING_TOP = "paddingTop";
    String PADDING_LEFT = "paddingLeft";
    String PADDING_RIGHT = "paddingRight";
    String PADDING_BOTTOM = "paddingBottom";

    String LEFT = "left";
    String TOP = "top";
    String RIGHT = "right";
    String BOTTOM = "bottom";


    String BACKGROUND_COLOR = "backgroundColor";
    String BACKGROUND_IMAGE = "backgroundImage";
    String OPACITY = "opacity";
    String BORDER_RADIUS = "borderRadius";
    String BORDER_WIDTH = "borderWidth";
    String BORDER_COLOR = "borderColor";
    String BORDER_STYLE = "borderStyle";
    String BORDER_TOP_WIDTH = "borderTopWidth";
    String BORDER_RIGHT_WIDTH = "borderRightWidth";
    String BORDER_BOTTOM_WIDTH = "borderBottomWidth";
    String BORDER_LEFT_WIDTH = "borderLeftWidth";
    String BORDER_TOP_COLOR = "borderTopColor";
    String BORDER_RIGHT_COLOR = "borderRightColor";
    String BORDER_BOTTOM_COLOR = "borderBottomColor";
    String BORDER_LEFT_COLOR = "borderLeftColor";
    String BORDER_TOP_LEFT_RADIUS = "borderTopLeftRadius";
    String BORDER_TOP_RIGHT_RADIUS = "borderTopRightRadius";
    String BORDER_BOTTOM_RIGHT_RADIUS = "borderBottomRightRadius";
    String BORDER_BOTTOM_LEFT_RADIUS = "borderBottomLeftRadius";
    String BORDER_RIGHT_STYLE = "borderRightStyle";
    String BORDER_BOTTOM_STYLE = "borderBottomStyle";
    String BORDER_LEFT_STYLE = "borderLeftStyle";
    String BORDER_TOP_STYLE = "borderTopStyle";
    String BOX_SHADOW = "boxShadow";
    String SHADOW_QUALITY = "shadowQuality";

    String POSITION = "position";

    String KEEP_SCROLL_POSITION = "keepScrollPosition";

    String TEXT_DECORATION = "textDecoration";
    String TEXT_ALIGN = "textAlign";
    String FONT_WEIGHT = "fontWeight";
    String FONT_STYLE = "fontStyle";
    String FONT_SIZE = "fontSize";
    String COLOR = "color";
    String LINES = "lines";
    String FONT_FAMILY = "fontFamily";
    String TEXT_OVERFLOW = "textOverflow";
    String ELLIPSIS = "ellipsis";
    String LINE_HEIGHT = "lineHeight";
    String DISABLED = "disabled";
    String VALUE = "value";
    String IMAGE_QUALITY = "imageQuality";
    String FILTER = "filter";
    String QUALITY = "quality";
    String SRC = "src";
    String SOURCE = "source";
    String PLACE_HOLDER = "placeHolder";
    String RESIZE_MODE = "resizeMode";
    String AUTO_RECYCLE = "autoBitmapRecycle";
    String SHOW_INDICATORS = "showIndicators";
    String AUTO_PLAY = "autoPlay";
    String AUTOPLAY = "autoplay";
    String CONTROLS = "controls";
    String ZORDERTOP = "zOrderTop";
    String SCROLL_DIRECTION = "scrollDirection";
    String SCOPE = "scope";
    String RECYCLE = "recycle";
    String LOADMORERETRY = "loadmoreretry";
    String LOADMOREOFFSET = "loadmoreoffset";
    String RECYCLE_IMAGE = "recycleImage";
    String LAYOUT = "layout";
    String SPAN_OFFSETS = "spanOffsets";
    String COLUMN_WIDTH = "columnWidth";
    String COLUMN_COUNT = "columnCount";
    String COLUMN_GAP = "columnGap";
    String SHOW_SCROLLBAR = "showScrollbar";
    String LEFT_GAP= "leftGap";
    String RIGHT_GAP= "rightGap";
    String OVERFLOW = "overflow";
    String TYPE = "type";
    String PLACEHOLDER = "placeholder";
    String PLACEHOLDER_COLOR = "placeholderColor";
    String AUTOFOCUS = "autofocus";
    String SINGLELINE = "singleline";
    String MAX_LENGTH = "maxLength";
    String MAXLENGTH = "maxlength";
    String ROWS = "rows";
    String CHECKED = "checked";
    String ANIMATING = "animating";
    String VISIBILITY = "visibility";
    String ITEM_COLOR = "itemColor";
    String ITEM_SELECTED_COLOR = "itemSelectedColor";
    String ITEM_SIZE = "itemSize";
    String DISPLAY = "display";
    String SHOW_LOADING = "show-loading";
    String SUFFIX = "suffix";
    String RESIZE = "resize";
    String IMAGE_SHARPEN = "imageSharpen";
    String SHARPEN = "sharpen";
    String PREFIX = "prefix";
    String INDEX = "index";
    String INTERVAL = "interval";
    String PLAY_STATUS = "playStatus";
    String FONT_FACE = "fontFace";
    String MAX = "max";
    String MIN = "min";
    String NAV_BAR_VISIBILITY = "hidden";
    String OFFSET_X_ACCURACY = "offsetXAccuracy";
    String OFFSET_X_RATIO = "offsetXRatio";
    String ELEVATION = "elevation";
    String PERSPECTIVE = "perspective";
    String SCROLLABLE = "scrollable";
    String DRAGGABLE = "draggable";
    String DISTANCE_Y = "dy";
    String PULLING_DISTANCE = "pullingDistance";
    String VIEW_HEIGHT = "viewHeight";
    String PREVENT_MOVE_EVENT = "preventMoveEvent";
    String SELECTION_START = "selectionStart";
    String SELECTION_END = "selectionEnd";
    String OFFSET_ACCURACY = "offsetAccuracy";
    String CONTENT_SIZE = "contentSize";
    String CONTENT_OFFSET = "contentOffset";
    String ISDRAGGING = "isDragging";
    String X = "x";
    String Y = "y";
    String RETURN_KEY_TYPE = "returnKeyType";
    String OFFSET = "offset";
    String ANIMATED = "animated";
    String STABLE = "stable";
    String TRANSFORM = "transform";
    String TRANSFORM_ORIGIN = "transformOrigin";
    String KEEP_INDEX = "keepIndex";
    String KEEP_SELECTION_INDEX = "keepSelectionIndex";

    String INSERT_CELL_ANIMATION = "insertAnimation";
    String DELETE_CELL_ANIMATION = "deleteAnimation";
    String AUTO = "auto";
    String NORMAL = "normal";
    String ARIA_LABEL = "ariaLabel";
    String ARIA_HIDDEN = "ariaHidden";
    String ROLE = "role";
    String ACCESSIBLE = "accessible";

    String LAYERLIMIT = "layerLimit";
    String LAYER_LIMIT = "layer-limit";

    String DIRECTION = "direction";
    String RTL = "rtl";

    String STICKY_OFFSET = "stickyOffset";
    String HAS_FIXED_SIZE = "hasFixedSize";
    String KEEP_POSITION_LAYOUT_DELAY = "keepPositionLayoutDelay";

    String OVERFLOW_HIDDEN_HEIGHT = "overflowHiddenHeight";
    String OVERFLOW_HIDDEN_WIDTH = "overflowHiddenWidth";

    String PRIORITY  = "priority";

    String STRATEGY  = "strategy";

    String ALLOW_COPY_PASTE = "allowCopyPaste";
    String INCLUDE_FONT_PADDING = "includeFontPadding";
    String ENABLE_COPY = "enableCopy";

    String PAGE_ENABLED = "pagingEnabled";
    String PAGE_SIZE = "pageSize";



    interface  Recycler{
      String LIST_DATA = "listData";
      String LIST_DATA_ITEM  ="alias";
      String LIST_DATA_ITEM_INDEX = "index";
      String LIST_DATA_TEMPLATE_SWITCH_KEY = "switch";
      String SLOT_TEMPLATE_CASE = "case";
      String SLOT_TEMPLATE_DEFAULT = "default";
      String CELL_INDEX = "cellIndex";
      String TYPE_INDEX = "typeIndex";
    }


    String VIF_FALSE = "ifFalse";
    String UNDEFINED = "undefined";
    String FLAT = "flat";
    String RIPPLE_ENABLED = "rippleEnabled";

    String SHOULD_STOP_PROPAGATION_INIT_RESULT = "shouldStopPropagationInitResult";
    String SHOULD_STOP_PROPAGATION_INTERVAL = "shouldStopPropagationInterval";


    String NEST_SCROLLING_ENABLED = "nestedScrollingEnabled";

    String ORIENTATION  = "orientation";
  }

  public interface Value {

    int DENSITY = 3;
    int NAV_BAR_SHOWN = 0;
    int NAV_BAR_HIDDEN = 1;
    int AUTO = -1;
    int COLUMN_GAP_NORMAL = 32;
    int COLUMN_COUNT_NORMAL = 1;
    String MULTI_COLUMN = "multi-column";
    String GRID = "grid";
    String STICKY = "sticky";
    String FIXED = "fixed";
    String LEFT = "left";
    String RIGHT = "right";
    String CENTER = "center";
    String BOLD = "bold";
    String ITALIC = "italic";
    String ORIGINAL = "original";
    String LOW = "low";
    String NORMAL = "normal";
    String HIGH = "high";
    String VISIBLE = "visible";
    String HIDDEN = "hidden";
    String TEXT = "text";
    String PASSWORD = "password";
    String TEL = "tel";
    String EMAIL = "email";
    String URL = "url";
    String DATE = "date";
    String TIME = "time";
    String DATETIME = "datetime";
    String PLAY = "play";
    String PAUSE = "pause";
    String STOP = "stop";
    String DIRECTION_LEFT = "left";
    String DIRECTION_RIGHT = "right";
    String DIRECTION_UP = "up";
    String DIRECTION_DOWN = "down";
    String NUMBER = "number";

    String NONE = "none";
    String DEFAULT = "default";

    String HORIZONTAL = "horizontal";
  }

  public interface Event {

    String CLICK = "click";
    String APPEAR = "appear";
    String DISAPPEAR = "disappear";
    String LOADMORE = "loadmore";
    String FOCUS = "focus";
    String BLUR = "blur";
    String INPUT = "input";
    String VIEWAPPEAR = "viewappear";
    String VIEWDISAPPEAR = "viewdisappear";
    String START = "start";
    String PAUSE = "pause";
    String FINISH = "finish";
    String FAIL = "fail";
    String ERROR = "error";
    String RECEIVEDTITLE = "receivedtitle";
    String PAGEFINISH = "pagefinish";
    String PAGESTART = "pagestart";
    String ONREFRESH = "refresh";
    String ONLOADING = "loading";
    String ONLOAD = "load";
    String CHANGE = "change";
    String ONPULLING_DOWN = "pullingdown";
    String ONPULLING_UP = "pullingup";
    String SCROLL = "scroll";
    String SCROLL_START = "scrollstart";
    String SCROLL_END = "scrollend";
    String CLICKBACKITEM = "clickbackitem";
    String RESUME_EVENT = "WXApplicationDidBecomeActiveEvent";
    String PAUSE_EVENT = "WXApplicationWillResignActiveEvent";
    String RETURN = "return";
    String KEYBOARD = "keyboard";

    String UNSTICKY = "unsticky";
    String STICKY = "sticky";

    String ON_TRANSITION_END = "transitionEnd";

    String LAYEROVERFLOW = "layeroverflow";

    interface SLOT_LIFECYCLE {
      String CREATE = "create";
      String ATTACH = "attach";
      String DETACH = "detach";
      String DESTORY = "destroy";
    }

    String STOP_PROPAGATION = "stopPropagation";
    String STOP_PROPAGATION_RAX = "stoppropagation";
    String ONMESSAGE = "message";
    String NATIVE_BACK = "nativeback";
  }

  public interface PSEUDO {
    String ACTIVE = ":active";
    String ENABLED = ":enabled";
    String DISABLED = ":disabled";
    String FOCUS = ":focus";
  }

  public interface Scheme {

    String FILE = "file";
    String HTTPS = "https";
    String HTTP = "http";
    String LOCAL = "local";
    String DATA = "data";
  }

  public interface CodeCache {
    String URL = "bundleUrl";
    String DIGEST = "bundleDigest";
    String PATH = "codeCachePath";
    String BANNER_DIGEST = "digest";
    String SAVE_PATH = "v8";
  }

  public interface TimeFunction {
    String LINEAR = "linear";
    String EASE_IN_OUT = "ease-in-out";
    String EASE_IN = "ease-in";
    String EASE_OUT = "ease-out";
    String EASE = "ease";
    String CUBIC_BEZIER = "cubic-bezier";
  }
}
